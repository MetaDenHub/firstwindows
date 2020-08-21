package nine;

import java.util.Arrays;

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}

	Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor {
	String process(Object input) {// kovarianted return's type
		return ((String)input).toUpperCase();
	}
}

class DownCase extends Processor {
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends Processor {
	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}

public class Apply {
	
	public static void process(Processor p, Object s) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
	public static String s = "I am a good programmer ;)";
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new DownCase(), s);
		process(new Splitter(), s);
		
	}

}
