package twelve;

class FourException extends Exception {
}

public class AlwaysFinally {
	public static void main(String[] args) {
		System.out.println("входим в первый блок трай");
		try {
			System.out.println("входим во второй блок трай");
			try {
				throw new FourException();
			} finally {
				System.out.println("finally внутри");
			}
		} catch (FourException e) {
			System.out.println("перехвачено во внешнем блоке кетч");
		} finally {
			System.out.println("finally во внешнем блоке");
		}
	}
}	
