package jp.ac.hcs.vending.util;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.SwingWorker;

/**
 * 音声情報を管理するクラス
 */
public class Sound {

	/** 音声再生を行うかどうかを管理する定数 */
	public static final boolean SOUND_ON = true;

	/** 音声ファイルのファイルパスの格納領域 */
	private String filePath;

	/** ループ再生するかどうかのフラグを管理する領域 */
	private boolean looped;

	/**
	 * WAV形式の音声を再生する
	 * @param filePath WAV形式の音声ファイルへのパス
	 * @param looped ループ再生するか(true:する, false:しない)
	 */
	public void playSound(String filePath, boolean looped) {

		this.filePath = filePath;
		this.looped = looped;

		// 定数の内容で再生するかどうかを判断する
		if (SOUND_ON) {
			SoundWorker soundWorker = new SoundWorker();
			soundWorker.execute();
		}
	}

	public void playSound(String filePath) {
		// デフォルトはループ再生しない
		playSound(filePath, false);
	}

	/**
	 * loopedのgetter.
	 * @return looped
	 */
	public boolean isLooped() {
		return looped;
	}

	/** マルチスレッド用動作クラス */
	class SoundWorker extends SwingWorker<Object, Object> {

		@Override
		protected Object doInBackground() throws Exception {

			AudioInputStream ais = null;

			try {

				// 再生準備
				ais = AudioSystem.getAudioInputStream(new File(filePath));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				Clip clip = (Clip) AudioSystem.getLine(info);
				clip.open(ais);

				// ループ再生判定
				if (isLooped()) {
					clip.loop(100);
				} else {
					clip.loop(0);
				}

				// 実行
				clip.flush();
				while (clip.isActive()) {
					Thread.sleep(100);
				}

			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
				e.printStackTrace();

			} finally {
				try {
					ais.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			return null;

		}

	}

}
