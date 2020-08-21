package twelve;

//
//
// использование return в блоке finally подавляет любое возбужденное исключение 
//
//

public class ExceptionSilencer {
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} finally {
			return;
		}
	}
}
