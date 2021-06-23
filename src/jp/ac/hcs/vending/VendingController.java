package jp.ac.hcs.vending;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * HCS自動販売機アプリのUI関連を管理するクラス
 * - 画面を表示する
 * - 音を鳴らす
 * - ファイルを出力する
 */
public class VendingController {

	/** 画面と連動しているコンポーネント郡 */
	@FXML
	private TextField inputMoney;
	@FXML
	private Label labelOutMessage;
	@FXML
	private Label labelCounter;
	@FXML
	private Label labelOutItem;
	@FXML
	private ImageView vendingItem1;
	@FXML
	private ImageView vendingItem2;
	@FXML
	private ImageView vendingItem3;
	@FXML
	private ImageView vendingItem4;
	@FXML
	private ImageView vendingItem5;
	@FXML
	private ImageView vendingItem6;
	@FXML
	private Button buttonItem1;
	@FXML
	private Button buttonItem2;
	@FXML
	private Button buttonItem3;
	@FXML
	private Button buttonItem4;
	@FXML
	private Button buttonItem5;
	@FXML
	private Button buttonItem6;

	@FXML
	void initialize() {
		// TODO
	}

	@FXML
	void buttonInputMoney(ActionEvent event) {
		// TODO
	}

	@FXML
	void buttonReturnMoney(ActionEvent event) {
		// TODO
	}

	@FXML
	void pushButtonItem1(ActionEvent event) {
		// TODO
	}

	@FXML
	void pushButtonItem2(ActionEvent event) {
		// TODO
	}

	@FXML
	void pushButtonItem3(ActionEvent event) {
		// TODO
	}

	@FXML
	void pushButtonItem4(ActionEvent event) {
		// TODO
	}

	@FXML
	void pushButtonItem5(ActionEvent event) {
		// TODO
	}

	@FXML
	void pushButtonItem6(ActionEvent event) {
		// TODO
	}

}
