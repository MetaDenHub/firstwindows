package nine.filter;

public interface Processor {
	String name();
	Object process(Object input);
}
