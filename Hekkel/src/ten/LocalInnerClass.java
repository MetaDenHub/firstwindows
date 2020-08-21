package ten;

interface Counter {
	int next();
}

public class LocalInnerClass {
	private int count = 0;

	Counter getCounter(final String name) {
		class LocalCounter implements Counter {
			public LocalCounter() {
				System.out.println("Local Constructor =)");
			}

			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		}
		return new LocalCounter();
	}

	// it is same as in anonymous classes
	Counter getCounter2(final String name) {
		return new Counter() {

			// anonymous classes cannot have own constructor
			{
				System.out.println("anonymous =)");
			}

			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		};
	}

	public static void main(String[] args) {
		LocalInnerClass inCl = new LocalInnerClass();
		Counter c1 = inCl.getCounter("Denis"),
				c2 = inCl.getCounter2("Draste");
		for(int i = 0; i<5; i++)
			System.out.println(c1.next());
		for(int i = 0; i < 5; i++)
			System.out.println(c2.next());
	}
}
