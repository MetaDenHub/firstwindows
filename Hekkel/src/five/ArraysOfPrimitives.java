package five;

public class ArraysOfPrimitives {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b;
		b = a;
		for(int i = 0; i < b.length; i++) 
			b[i] = b[i] + 1;
		for(int i = 0; i < a.length; i++)
			System.out.println("a+["+i+"] = " + a[i]);
	
	}

}
