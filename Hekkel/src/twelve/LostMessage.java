package twelve;

class VeryImportantException extends Exception {
	public String toString() {
		return "очень важное исключение";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "второстепенное исключение";
	}
}

public class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException {
		try {
			throw new HoHumException();

		} catch (HoHumException e) {
			e.printStackTrace(System.out);
		} finally {

		}
		return;
	}

	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				lm.dispose();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
