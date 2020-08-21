package nine;

/*
 * #14, 15 glava 9
 * 
 * xz chto za hrenj..s
 * 
 * tipo sam zdelal..
 * 
 * */

interface Happy {
	void smile();

	void sweet();
}

interface Protect {
	void respect();

	void kiss();
}

interface Help {
	void togive();

	void cook();
}

interface Love extends Happy, Protect, Help {
	void love();
}

class Ext extends ImplManyInterfaces implements Love {

	@Override
	public void smile() {
		// TODO Auto-generated method stub
		System.out.println("smile()");
	}

	@Override
	public void respect() {
		// TODO Auto-generated method stub
		System.out.println("respect()");
	}

	@Override
	public void kiss() {
		// TODO Auto-generated method stub
		System.out.println("kiss()");
	}

	@Override
	public void togive() {
		// TODO Auto-generated method stub
		System.out.println("togive()");
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("cook()");
	}

	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("love()");
	}

	@Override
	public void sweet() {
		// TODO Auto-generated method stub
		System.out.println("sweet()");
	}

}

abstract class AbstrExt extends Ext{
	
}

public class ImplManyInterfaces {
	public static void main(String[] args) {
		Ext eelovee = new Ext();
		a(eelovee);
		System.out.println();
		b(eelovee);
		System.out.println();
		c(eelovee);
		System.out.println();
		d(eelovee);
	}

	public static void a(Happy happy) {
		happy.smile();
		happy.sweet();
	}

	public static void b(Help help) {
		help.cook();
		help.togive();
	}

	public static void c(Love love) {
		love.cook();
		love.kiss();
		love.love();
		love.respect();
		love.smile();
		love.sweet();
		love.togive();
	}

	public static void d(Protect protect) {
		protect.kiss();
		protect.respect();
	}

}
