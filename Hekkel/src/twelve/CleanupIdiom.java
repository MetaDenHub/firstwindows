package twelve;

import java.util.AbstractList;
import java.util.List;

//
//
// за созданием каждого обьекта, нуждающегося в завершении
// должна следовать конструкция try-finally
//

class NeedsCleanup {
	private static long counter = 1;
	private final long id = counter++;

	public void dispose() {
		System.out.println("NeedsCleanup " + id + "освобожден");
	}
}

class ConstructionException extends Exception {
}

class NeedsCleanup2 extends NeedsCleanup {
	// возможы ошибки при конструировании
	public NeedsCleanup2() throws ConstructionException {
	}
}

public class CleanupIdiom {
	public static void main(String[] args) {
		// часть 1
		NeedsCleanup nc1 = new NeedsCleanup();
		try {
			// ..
		} finally {
			nc1.dispose();
		}
		// часть 2
		// если ошибки конструирования невозможны, обьекты можно згруппировать
		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		try {
			// ..
		} finally {
			nc3.dispose(); // обратный порядок конструирования
			nc2.dispose();
		}

		// часть 3
		// Если при конструировании возможны ошибки
		// необходимо защитить каждую операцию
		try {
			NeedsCleanup2 nc4 = new NeedsCleanup2();
			try {
				NeedsCleanup2 nc5 = new NeedsCleanup2();
				try {
					// ..
				} finally {
					nc5.dispose();
				}
			} catch (ConstructionException e) { // constructor nc5
				System.out.println(e);
			} finally {
				nc4.dispose();
			}
		} catch (ConstructionException e) { // constr nc4
			System.out.println(e);
		}
	}
}
