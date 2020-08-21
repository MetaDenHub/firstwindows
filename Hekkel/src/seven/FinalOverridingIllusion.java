package seven;

class WithFinals {

	// так само як і просто private
	private final void f() {
		System.out.println("WithFinals.f()");
	}

	// автоматично є final
	private void g() {
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}

	public void g() {
		System.out.println("OverridignPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {

	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}

	//@Override
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// можна провести висхідне перетворення
		OverridingPrivate op = op2;
		// але методи викликати не можна:
		// op.f();
		// op.g();
		WithFinals wf = op2;
		// wf.f();
		// wf.g();

	}
}
