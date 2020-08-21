package seven;

import sevenOne.ProtectCall;

class Villain extends ProtectCall {
	public static void main(String[] args) {
		ProtectCall call = new ProtectCall();
		call.toHello();

	}

	private String name;

	protected void set(String nm) {
		name = nm;
	}

	public Villain(String name) {
		this.name = name;
	}

	public String toString() {
		return "я об'єкт Villain, моє ім'я " + name;
	}
}

public class Orc extends Villain {
	private int orcNumber;

	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}

	public void change(String name, int orcNumber) {
		set(name);
		this.orcNumber = orcNumber;
	}

	public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}

	public static void main(String[] args) {
		Orc orc = new Orc("Limburger", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}
}
