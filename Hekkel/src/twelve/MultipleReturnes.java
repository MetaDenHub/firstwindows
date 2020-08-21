package twelve;

public class MultipleReturnes {
	public static void f(int i) {
		System.out.println("инициализация, требующая завершения");
		try {
			System.out.println("точка1");
			if (i == 1)
				return;
			System.out.println("точка2");
			if (i == 2)
				return;
			System.out.println("точка3");
			if (i == 3)
				return;
			System.out.println("end =)");
			return;
		} finally {
			System.out.println("завершающие действия");
		}

	}
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++)
			f(i);
	}
}
