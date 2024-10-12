package algorithms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(9));
		
	}
	static int factorial(int number) {
			if (number <= 0) throw new Error("Uhh! Number parametr must be a positive number");

			  // базовый случай
			  if (number == 1) return 1;

			  // рекурсивный случай
			  return number * factorial(number - 1);
		}

}
