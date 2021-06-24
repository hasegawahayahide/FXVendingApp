package jp.ac.hcs.vending.machine;
/**
 * 自動販売機の商品を管理する
 * @author s20202034
 */
public abstract class VendingItem {
	/** 商品名 */
	private String name;
	/** 金額 */
	private int price;
	/** 在庫数 */
	private int count;
	/** ステータスコード
	 * 0.エラーなし(初期状態)
	 * 1.残高不足
	 * 2.在庫不足
	 */
	private int statusCode;

	/** コンストラクタ
	 * @param name 商品名
	 * @param price 金額
	 * @param count 在庫数
	 * @param statusCode ステータスコード 初期状態(0)を設定
	 */
	public VendingItem(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.statusCode = 0;
	}

	/** ボタン名を作成する
	 * @return
	 */
	public String createButtonText() {
		return this.name + "[" + this.price + "円]";
	}

	public VendingItem buyItem(int keepMoney) {
		// TODO
		return this;
	}

	/**
	 * 商品情報を表示する
	 * @return 商品情報(今回はテキスト表示)
	 */
	public abstract String showItemInfo();

	/* getter群*/
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	public int getStatusCode() {
		return statusCode;
	}
}
