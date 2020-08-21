package five;

public class OneMore {
public OneMore() {
	this("Hello");
}
OneMore(String s){
	System.out.println(s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OneMore();
		
	}
	static void qwe() {
		System.out.println("static qwe");
		//this.ewq(); // Cannot use this in a static context
	}
	void ewq() {
		System.out.println("ewq");
		this.qwe();
	}

}
