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
			System.out.println("Ошибка: checkedOut");
		}
	}
}

public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		// правильная очистка
		novel.checkIn();
		//теряем ссылку, забыли про очистку:
		new Book(true);
		//принудительная уборка мусора и финализация:
		System.gc();
	}

}
