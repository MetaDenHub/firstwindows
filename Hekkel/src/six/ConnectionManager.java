package six;

class Connection {
	private int ii;

	private Connection() {
	}

	private Connection(int i) {
		this.ii = i;
	}

	private static int counter = 0;

	private static Connection conn[] = new Connection[2];
	static {

		conn[0] = new Connection(1);
		conn[1] = new Connection(2);
	}

	public static Connection access(int i) {

		if (counter >= 2) {
			return null;
		} else {
			counter++;
			return conn[i];
		}
	}
}

public class ConnectionManager {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(Connection.access(0));
		}
	}
}
