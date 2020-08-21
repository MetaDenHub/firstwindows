package four;

public class NullHungr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ii=0;
		for(int i=1; i<=100;i++) {
			if (ii == 10) {
				ii=0;
				System.out.println();
			}
			System.out.print(i+" ");
			ii++;
		}
	}

}
