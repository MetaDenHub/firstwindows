package algorithms;

/* Примером применения стратегии "Разделяй и властвуй" является 
 * нахождение наибольшего общего делителя двух чисел с помощью алгоритма Евклида.
 * НОД поиск наибольшего общего делителя
 * При этом числа постенно уменьшаются, пока не достигнут собственно значения наибольшего общего делителя.
 * 
 * */

public class Euclide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(365,7));
	}
	static int gcd(int number1, int number2) {
	 if (number1 == number2) return number1;

	  int max = Math.max(number1, number2);
	  int min = Math.min(number1, number2);

	  int remainder = max % min;

	  while(remainder >= 1) {
	    max = remainder;
	    if (max < min) {int x = max; max = min; min = x;}
	    remainder = max % min; 
	  }

	  return min;
	}


}
