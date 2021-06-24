/**
 *
 */
package jp.ac.hcs.vending.machine;

/** チケットの商品情報を管理するクラス
 * @author s20202034
 *
 */
public class Ticket extends VendingItem {
	/** キャッチコピー*/
	private String catchCopy;

	/** ストーリー*/
	private String story;

	/** コンストラクタ
	 * @param name 商品名
	 * @param price 金額
	 * @param count 在庫数
	 * @param catchCopy キャッチコピー
	 * @param story ストーリー
	 */
	public Ticket(String name, int price, int count, String catchCopy, String story) {
		super(name, price, count);
		this.catchCopy = catchCopy;
		this.story = story;
	}

	/** 商品情報を表示する(オーバーライド)
	 * @return 商品情報
	 */
	@Override
	public String showItemInfo() {
		StringBuilder sb = new StringBuilder();
		// 商品名
		sb.append(this.getName());
		// キャッチコピー
		sb.append("[").append(this.catchCopy).append("]").append("\n");
		// ストーリー
		sb.append(this.story);
		return sb.toString();
	}

}
