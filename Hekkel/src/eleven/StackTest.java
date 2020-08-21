package eleven;

/*
 * 
 * заменить addLast() на addFirst()
 * 
 * 
 * */
import java.util.Iterator;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Stack<String> stack2 = new Stack<String>();
		for (String s : "My dog has fleas".split(" "))
			stack.push(s);
		System.out.println();
		while (!stack.empty())
			System.out.println(stack.pop());
		//////////////////
		System.out.println("________________________________________");
		String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		String[] splitted = str.split("");
		for (int i = 0; i < splitted.length; i++) {
			switch (splitted[i]) {
			case "+":
				stack2.push(splitted[i + 1]);
				break;
			case "-":
				stack2.pop();
				break;

			default:

				break;
			}
		}
		// char[] charr = str.toCharArray();
		// for (char c : charr) {
		// switch(c) {
		// case '+': stack2.push(++c);
		// }
		// }
		// System.out.println(str);
	}
}
