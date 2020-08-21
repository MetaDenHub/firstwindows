package five;
/**
 * 
 * @author Vinychenko
 *
 * Testing the order of initialization static fields
 *
 */
public class StaticTest {
	static String ststr = "static String";
	static String str;
	static {
		str = "str";
	}

	static void q() {
		System.out.println("in q(): " + ststr);
		System.out.println("in q(): " + str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main(): " + ststr);
		System.out.println("in main(): " + str);
		StaticTest.q();

	}

}
