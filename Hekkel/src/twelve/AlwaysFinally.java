package twelve;

class FourException extends Exception {
}

public class AlwaysFinally {
	public static void main(String[] args) {
		System.out.println("������ � ������ ���� ����");
		try {
			System.out.println("������ �� ������ ���� ����");
			try {
				throw new FourException();
			} finally {
				System.out.println("finally ������");
			}
		} catch (FourException e) {
			System.out.println("����������� �� ������� ����� ����");
		} finally {
			System.out.println("finally �� ������� �����");
		}
	}
}	
