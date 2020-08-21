package twelve;

//
// 
// пример обработки открытия файла вместе с InputFile.java
//
//
public class Cleanup {
	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("Cleanup.java");
			try {
				String s;
				int i = 1;
				while ((s = in.getLine()) != null)
					; // обработка данных со строками
			} catch (Exception e) {
				System.out.println("перехвачено исключение Exception в main");
				e.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		} catch (Exception e) {
			System.out.println("ошибка при коструировании InputFile");
		}
	}
}
