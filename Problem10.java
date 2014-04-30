// https://projecteuler.net/problem=10
// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
// Find the sum of all the primes below two million.

public class Problem10 {
	public static void main(String[] args) {
		long twomil = 2000000;
		calculate(twomil);
	}

	public static void calculate(long n) {
		long sum = 2;
		for(int k = 3; k < n; k++){
			if(isPrime(k)){
				sum += k;
			}
			
		}
		System.out.println(sum);
	}

	public static boolean isPrime(long n) {
		if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
