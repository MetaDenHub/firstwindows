package questions;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; ) {
			switch(new Integer(i++)) {
			case 1:
				System.out.println("one");
				break;
			case 3:
				System.out.println("three");
			case 4:
				System.out.println("four");
			default:
				System.out.println("default");
			}
		}
	}

}
