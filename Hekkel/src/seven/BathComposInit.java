package seven;

class Soap {
	private String s;
	Soap(){
		System.out.println("Soap()");
		s = "Constructed";
	}
	public String toString() {
		return s;
	}
}

public class BathComposInit {
	private String //ініціалізація в місці визначення:
		s1 = "щасливий",
		s2 = "щасливий",
		s3, s4;
	private Soap castille;
	private int i;
	private float toy;
	public BathComposInit() {
		System.out.println("in Bath()'s Constructer");
		s3 = "Happy";
		toy = 3.14f;
		castille = new Soap();
	}
	// obj initialization:
	{i = 47;}
	public String toString(){
		
		if(s4 == null) // відкладена ініціалізація
			s4 = "радісний";
		return
			"s1 = " + s1 + "\n" +
			"s2 = " + s2 + "\n" +
			"s3 = " + s3 + "\n" +
			"s4 = " + s4 + "\n" +
			"i = " + i + "\n" +
			"toy = " + toy + "\n" +
			"castille " + castille;
	}
	public static void main(String[] args) {
		BathComposInit b = new BathComposInit();
		System.out.println(b);
	}

}
