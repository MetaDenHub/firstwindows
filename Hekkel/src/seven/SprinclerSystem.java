package seven;

class WaterSource {
	private String s;
	WaterSource(){
		System.out.println("WaterSource has been constructed");
	}
	public String toString() {
		return s;
	}
}

public class SprinclerSystem {
	private String valve1, valve2, valve3, valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	public String toString() {
		return 
			"valve1 = " + valve1 + " " +
			"valve2 = " + valve2 + " " +
			"valve3 = " + valve3 + " " +
			"valve4 = " + valve4 + "\n"+
			"i = " + i + " " + "f = " + f +
			"source = " + source;
	}
	public static void main(String[] args) {
		SprinclerSystem sprinclers = new SprinclerSystem();
		System.out.println(sprinclers);
	}

}
