package seven;

class Cleans {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}
}

public class DelegationDetergent {
	Cleans control = new Cleans();

	void dilute() {
		control.dilute();
	}

	void apply() {
		control.apply();
	}

	void scrub() {
		control.scrub();
	}

	public String toString() {
		return control.toString();
	}

	public static void main(String[] args) {
		DelegationDetergent d = new DelegationDetergent();
		d.dilute();
		d.apply();
		d.apply();
		d.scrub();
		d.toString();
		System.out.println(d);
	}

}
