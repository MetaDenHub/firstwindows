package twelve;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//
//
// обработка исключений для открыия файлов
// точка входа Cleanup.java
//

public class InputFile {
	private BufferedReader in;

	public InputFile(String fname) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fname));
		} catch (FileNotFoundException e) {
			System.out.println("Could not open " + fname);
			throw e;
		} catch (Exception e) {
			// при других исключениях закрыть файл
			try {
				in.close();
			} catch (IOException e2) {
				System.out.println("ошибка при выполнении in.close()");
			}
			throw e;
		} finally {
			// здесь файл не закрывается!!!
			// потому, что здесь он бы закрывался 
			// при каждом завершении работы конструктора
		}
	}

	public String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch (IOException e) {
			throw new RuntimeException("ошибка при выполнении readLine()");
		}
		return s;
	}

	public void dispose() {
		try {
			in.close();
			System.out.println("dispose() успешен");
		} catch (Exception e2) {
			throw new RuntimeException("Ошибка при выполнении in.close()");
		}
	}
}
