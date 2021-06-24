package jp.ac.hcs.vending;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import jp.ac.hcs.vending.machine.Ticket;
import jp.ac.hcs.vending.machine.VendingMachine;

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

	/** 自動販売機のフィールド*/
	VendingMachine vendingMachine;

	@FXML
	void initialize() {
		// 自動販売機を生成
		this.vendingMachine = new VendingMachine();
		// 自動販売機の商品を作成
		createVendingItems();
		// 初期状態の表示設定
		viewMessage();
	}

	private void viewMessage() {
		viewMessage("いらっしゃいませ");
	}

	private void viewMessage(String outMessage) {
		viewMessage(outMessage,"取り出し口");
	}

	/**
	 * 自動販売機の表示を管理する
	 * - 引数がない場合は、初期表示を行う
	 * - 引数がある場合は、渡された内容を表示
	 * @param outMessage メッセージエリアに表示するメッセージ
	 * @param outItemMessage 取り出し口に表示するメッセージ
	 */
	private void viewMessage(String outMessage, String OutItemMessage) {
		// 入金金額を初期化
		inputMoney.setText("");
		// 保持金額を表示
		labelCounter.setText(this.vendingMachine.createKeepMoneyText());
		// 上のメッセージ表示
		labelOutMessage.setText(outMessage);
		// 下のメッセージ表示
		labelOutItem.setText(OutItemMessage);
	}

	/**
	 * 商品を作成し自動販売機に設定し、ボタン名も設定する。
	 */
	private void createVendingItems() {
		// 自動販売機の商品を準備
		// 商品を作成し、自動販売機に設定する
		vendingMachine.addVendingItem(new Ticket("チケット1",400,2,"抱腹絶倒","笑えるストーリー"));
		vendingMachine.addVendingItem(new Ticket("チケット2", 300, 10, "全俺が泣いた", "泣けるストーリー"));
		vendingMachine.addVendingItem(new Ticket("チケット3", 200, 3, "ハイテンション必須", "楽しいストーリー"));
		vendingMachine.addVendingItem(new Ticket("チケット4", 250, 5, "寝られない方必見", "難しいストーリー"));
		vendingMachine.addVendingItem(new Ticket("チケット5", 2000, 2, "決別は突然に", "儚いラブストーリー"));
		vendingMachine.addVendingItem(new Ticket("チケット6", 10000, 1, "野生の動物との出会い", "ハートフルストーリー"));


		// 商品に応じたボタン名を設定
		buttonItem1.setText(vendingMachine.getButtonText(1));
		buttonItem2.setText(vendingMachine.getButtonText(2));
		buttonItem3.setText(vendingMachine.getButtonText(3));
		buttonItem4.setText(vendingMachine.getButtonText(4));
		buttonItem5.setText(vendingMachine.getButtonText(5));
		buttonItem6.setText(vendingMachine.getButtonText(6));
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
