package qwe;


public class Main {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Xx.xxx());
		System.out.println(StaticTest.i);
		StaticTest.Incrementable();
		System.out.println(StaticTest.i);
		StaticTest st1= new StaticTest();
		StaticTest st2= new StaticTest();
		System.out.println("st1 = " + st1);
		System.out.println("st2 = " + st2);
		
		
		int ii=123124123;
		Integer i = ii;
		System.out.println(i.hashCode());
		System.out.println(i ==ii);
		System.out.println(++st1.i);
		System.out.println(--st2.i);
		System.out.println(StaticTest.i);
		/////
		NoStaticTest ns1 = new NoStaticTest();
		NoStaticTest ns2 = new NoStaticTest();
		ns1.i++;
		
		System.out.println("hflasdhflaksdjhfsad " +ns1.i);
		System.out.println(ns2.i);
	}
	int storage(String s) {
		return s.length() * 2;
	}

}
class StaticTest{
	static int i = 47;
	static void Incrementable() {
		i++;
	}
}
class NoStaticTest{
	int i = 1;
}
class Xx{
	static Integer xxx() {
			Integer x = 100;
			return x;
		}

}