package three;
import java.util.Random;




public class Monet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �������..");
		
		Integer i = new Random().nextInt(2);
		
		System.out.println("rndm = "+i);		
		if (i == 1) {
			System.out.println("����� ����!!");
		} else {
			System.out.println("�����!!");
		}

	}

}
