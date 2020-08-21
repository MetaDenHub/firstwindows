package operators;

public class Opers {
	
	public static void main(String[] args) {
		CL cl = new CL();
		System.out.println(cl.f);
		cl.f = 1.1f;
		System.out.println(cl.f);
		Opers o = new Opers();
		o.francenstein(cl);
		
		System.out.println(cl.f);

	}
	public void francenstein(CL cl) {
		cl.f = 0001f;
	}
}

class CL {
	float f = 0.9f;
}