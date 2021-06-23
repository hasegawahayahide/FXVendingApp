package jp.ac.hcs.vending;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *  HCS自動販売機アプリのアプリ設定・起動クラス
 */
public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			// アプリ情報の読み込み
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Vending.fxml"));
			Scene scene = new Scene(root, 400, 800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("X2AXXX Vending Machine");

			// アプリの表示
			primaryStage.show();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
