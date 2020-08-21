package ten;
/*
 * 
 * return instance of anonymous inner class
 * short version of Parcel7b.java
 * 
 * */
public class Parcel7 {
	public Contents contents() {
		return new Contents() {
			private int i = 11;
			@Override
			public int value() {
				// TODO Auto-generated method stub
				return i;
			}
		};
	}
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
	}

}
