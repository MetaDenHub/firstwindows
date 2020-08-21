package five;
class Book {
	boolean checkedOut = false;
	public Book(boolean checkOut) {
		checkedOut = checkOut;
	}
	void checkIn() {
		checkedOut = false;
	}
	public void finalize() {
		if(checkedOut) {
			System.out.println("������: checkedOut");
		}
	}
}

public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		// ���������� �������
		novel.checkIn();
		//������ ������, ������ ��� �������:
		new Book(true);
		//�������������� ������ ������ � �����������:
		System.gc();
	}

}
