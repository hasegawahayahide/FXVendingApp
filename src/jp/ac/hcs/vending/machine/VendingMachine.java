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

	public String addMoney(int Money) {
		// TODO
		return null;
	}

	public String resetMoney() {
		// TODO
		return null;
	}

	public VendingItem buyItem(int no) {
		// TODO
		return null;
	}
}
