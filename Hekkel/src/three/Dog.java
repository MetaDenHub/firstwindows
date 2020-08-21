package three;

public class Dog {
	String name;
	String says;
	static Dog sss = new Dog();
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "scruffy";
		dog.says = "gaf!";
		System.out.println("The " +dog.name+" says "+ dog.says);
		dog.name = "spot";
		dog.says = "gof!";
		System.out.println("The " +dog.name+" says "+ dog.says);
		Dog dogg = new Dog();
		
		dog = dogg;	
		System.out.println(dog.equals(dogg));
		System.out.println(dog == dogg);
		CL cl = new CL();
		System.out.println(dog.equals(cl.doggg));
		System.out.println(dog == cl.doggg);
		System.out.println(dog.equals(sss));
		System.out.println(dog == sss);
	}
}
class CL{
	Dog doggg = new Dog();
}
