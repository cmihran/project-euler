//https://projecteuler.net/problem=6
//The sum of the squares of the first ten natural numbers is,
//
//12 + 22 + ... + 102 = 385
//
//The square of the sum of the first ten natural numbers is,
//
//(1 + 2 + ... + 10)^2 = 55^2 = 3025
//
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Problem006 {
	public static void main(String[] args){
		System.out.println(sumOfSquares());
		System.out.println(squareOfSum());
		System.out.println(squareOfSum() - sumOfSquares());
	}
	
	public static double sumOfSquares(){
		double sum = 0;
		for(int i = 1; i <= 100; i++){
			sum+= Math.pow(i, 2);
		}
		return sum;
	}
	
	public static double squareOfSum(){
		double sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
		}
		System.out.println(sum);
		sum = Math.pow(sum, 2);
		return sum;
	}
}
