import java.util.ArrayList;

//https://projecteuler.net/problem=7
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?

public class Problem007 {
	public static void main(String[] args){
		System.out.println(isPrime(5));
		System.out.println(calc());
	}
	
	public static int calc(){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i = 2; primes.size() <= 10001; i++){
			if(isPrime(i)) primes.add(i);
		}
		
		return primes.get(10000);
	}
	
	public static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
