//https://projecteuler.net/problem=4
//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

public class Problem4 {
	// abc * def
	public static void main(String[] args){
		System.out.println(calculate());
	}
	
	public static int calculate() {
		int largest = -1;
		int num1;
		int num2;
		
		for(num1 = 100; num1 < 1000; num1++){
			for(num2 = 100; num2 < 1000; num2++){
				int product = num1*num2;
				if(isPalindrome(product) && product > largest) largest = product;
			}
		}
		
		return largest;
	}


	public static boolean isPalindrome(int n) {
		String str = Integer.toString(n);
	    return str.equals(new StringBuilder(str).reverse().toString());
	}
}
