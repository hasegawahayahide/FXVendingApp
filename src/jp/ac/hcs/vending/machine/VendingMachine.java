package jp.ac.hcs.vending.machine;
/** 自動販売機クラス
 * @author s20202034
 */

import java.util.ArrayList;

public class VendingMachine {

	/** 保持金額 */
	private int keepMoney;
	/** 商品情報を管理する配列 */
	private ArrayList<VendingItem> itemArray = new ArrayList<>();
	/** 受け付ける金種を管理する配列 */
	private ArrayList<Integer> acceptedMoneyKinds = new ArrayList<>();

	/** コンストラクタ */
	public VendingMachine() {
		// 保持金額を0円に設定
		this.keepMoney = 0;
		// 商品配列の初期化
		this.itemArray = new ArrayList<VendingItem>();
		// 受け付ける金種を設定
		this.acceptedMoneyKinds = new ArrayList<Integer>();
		this.acceptedMoneyKinds.add(1000);
		this.acceptedMoneyKinds.add(500);
		this.acceptedMoneyKinds.add(100);
		this.acceptedMoneyKinds.add(10);
	}

	/** 商品を自動販売機に設定する
	 * @param item 商品
	 */
	public void addVendingItem(VendingItem item) {
		// 商品を商品配列に追加
		this.itemArray.add(item);
	}

	/**ボタン名を返却する
	 * @param index 商品番号
	 * @return ボタン名のテキスト
	 */
	public String getButtonText(int index) {
		// 選択番号-1で位置を補正
		return this.itemArray.get(index-1).createButtonText();
	}

	/**
	 * 保持金額を返却する
	 * @return 保持金額のテキスト
	 */
	public String createKeepMoneyText() {
		return this.keepMoney + "円";
	}

	/**
	 * 入金する
	 * @param money
	 * @return 入金結果（入金金額またはエラーメッセージ）
	 * @throws IllegalArgumentException 入金できない金額だった
	 */
	public String addMoney(int money) throws IllegalArgumentException {
		// TODO 金種チェック
		// 入金
		this.keepMoney += money;
		// 入金結果のメッセージ
		StringBuilder sb = new StringBuilder();
		sb.append("[").append(money).append("]円");
		return sb.toString();
	}

	/**
	 * 保持金額を返却する
	 * @return 出金結果（金種ごとの枚数）
	 */
	public String resetMoney() {
		String cointsText = createCoinsText();
		this.keepMoney = 0;
		return cointsText;
	}

	/**
	 * 各金種が何枚かを計算し、返却する
	 * @param money 対象金額
	 * @return 表示用テキスト
	 */
	private String createCoinsText() {
		int money = this.keepMoney;
		StringBuilder sb= new StringBuilder();
		sb.append(money).append("円\n");
		// 金種を数える
		int count1000 = money / 1000;
		sb.append("1,000:").append(count1000).append("枚");
		money = money % 1000;
		int count500 = money / 500;
		sb.append("500:").append(count500).append("枚");
		money = money % 500;
		int count100 = money / 100;
		sb.append("100:").append(count100).append("枚");
		money = money % 100;
		int count10 = money / 10;
		sb.append("10:").append(count10).append("枚");
		money = money % 10;
		return sb.toString();
	}

	/**
	 * 商品を購入する
	 * @param num 商品の番号
	 * @return 商品
	 */
	public VendingItem buyItem(int no) {
		// 選択番号-1で位置を補正
		VendingItem item = this.itemArray.get(no - 1).buyItem(this.keepMoney);
		// 購入成功した場合
		if (item.getStatusCode() == 0) {
			this.keepMoney -= item.getPrice();
		}
		return item;
	}
}
