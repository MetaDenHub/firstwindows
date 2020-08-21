package three;

public class ShortProcessing {
	static boolean test1(int val){
		System.out.println("test1(" + val + ")");
		System.out.println("result" + (val<1));
		return val < 1;
	}
	static boolean test2(int val){
		System.out.println("test2(" + val + ")");
		System.out.println("result" + (val<2));
		return val < 2;
	}
	static boolean test3(int val){
		System.out.println("test3(" + val + ")");
		System.out.println("result" + (val<3));
		return val < 3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = test1(0) && test2(1) && test3(2);
		System.out.println("processing: " + b);
		float f = 1e38f;
		int ii = (int)f;
		
		System.out.println("f "+(ii+2));
		/////
		float ff = 1e-45f;
		double d = 1e308d;
		Integer max = Integer.MAX_VALUE;
		Integer min = Integer.MIN_VALUE;
		System.out.println(max+" "+min);
		int bigger = max*2;
		System.out.println(bigger);
		
		
	}
	

}
