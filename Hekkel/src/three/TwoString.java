package three;

public class TwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoString ts = new TwoString();
		ts.twostr("qwe", "ewq");
	}
	void twostr(String s1, String s2) {
		System.out.println("s1 == s2: " + s1 == s2);
		System.out.println("s1 == s2: " + s1!=s2);
		System.out.println("equals: " + s1.equals(s2));
		System.out.println("s1 < s2: " + (s1.length() == s2.length()) + s1.length() +" "+ s2.length());
	}

}
