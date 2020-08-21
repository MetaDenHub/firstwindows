package nine.filter;

public class JuggleProcessor implements Processor {

	public static void main(String[] args) {

	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		return null;
	}

}

class Juggling extends JuggleProcessor {
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
