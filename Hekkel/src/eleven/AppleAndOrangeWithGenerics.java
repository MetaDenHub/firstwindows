package eleven;

import java.util.ArrayList;
import java.util.Collection;

public class AppleAndOrangeWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple());
		for (Apple apple : apples) {
			System.out.println(apple.id());
		}
	}
}
