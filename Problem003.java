import java.util.ArrayList;

//https://projecteuler.net/problem=3
//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

public class Problem003 {
	public static void main(String[] args) {
		long num = 600851475143L;
		System.out.println(primeFactors(num));
		
		
	}
	
	public static ArrayList<Integer> primeFactors(long number) {
	    long n = number;
	    ArrayList<Integer> factors = new ArrayList<Integer>();
	    for (int i = 2; i <= n; i++) {
	      while (n % i == 0) {
	        factors.add(i);
	        n /= i;
	      }
	    }
	    return factors;
	  }
}
