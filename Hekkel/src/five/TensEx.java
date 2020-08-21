package five;

class CL {
	boolean fin = false;

	CL(boolean b) {
		fin = b;
	}

	CL() {

	}

	void instr() {
		fin = true;
	}

	void destr() {
		fin = false;
	}

	public void finalize() {
		if (fin) {
			System.out.println("Ошибка: CL obj still live");
		}
	}
}

public class TensEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CL cl = new CL();
		cl.instr();
		new CL(true);

		cl.destr();

		// принудительная уборка мусора и финализация:
		System.gc();
	}

}