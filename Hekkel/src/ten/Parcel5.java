package ten;

/*
 * 
 * class in method
 * 
 * */

public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;

			private PDestination(String whereTo) {
				label = whereTo;
			}

			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}

		}
		// upcasting to Destination:
		return new PDestination(s);
	}

	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination d = p.destination("Tanz");
		System.out.println(d.readLabel());
	}
}
