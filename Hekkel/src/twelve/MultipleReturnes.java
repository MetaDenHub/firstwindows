package twelve;

public class MultipleReturnes {
	public static void f(int i) {
		System.out.println("�������������, ��������� ����������");
		try {
			System.out.println("�����1");
			if (i == 1)
				return;
			System.out.println("�����2");
			if (i == 2)
				return;
			System.out.println("�����3");
			if (i == 3)
				return;
			System.out.println("end =)");
			return;
		} finally {
			System.out.println("����������� ��������");
		}

	}
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++)
			f(i);
	}
}
