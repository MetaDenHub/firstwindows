package five;

enum WhichMoney {
	FIVE, TEN, TWENTYFIVE, FIVTEEN
}

public class KindsOfMoney {
	WhichMoney wm;

	public KindsOfMoney(WhichMoney wm) {
		this.wm = wm;
	}

	void description() {
		switch (wm) {
		case FIVE:
			System.out.println(WhichMoney.FIVE);
			break;
		case TEN:
			System.out.println(WhichMoney.TEN);
			break;
		case TWENTYFIVE:
			System.out.println(WhichMoney.TWENTYFIVE);
			break;
		case FIVTEEN:
			System.out.println(WhichMoney.FIVTEEN);
			break;
		default:
			System.out.println("no money..");
		}
	}

	public static void main(String[] args) {
		// for (WhichMoney wm : WhichMoney.values()) {
		// System.out.println(wm.ordinal());
		KindsOfMoney k = new KindsOfMoney(WhichMoney.FIVTEEN);
		KindsOfMoney t = new KindsOfMoney(WhichMoney.TEN);

		k.description();
		t.description();
	}

}
