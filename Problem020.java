import java.math.BigInteger;

public class Problem015 {
	public static void main(String... args){
		BigInteger hundredFac = factorial(BigInteger.valueOf(100));
		System.out.println(sumDigits(hundredFac));
	}
	
	private static int sumDigits(BigInteger n) {
		BigInteger sum = BigInteger.ZERO;
		while(!n.equals(BigInteger.ZERO)){
			sum = sum.add(n.mod(BigInteger.valueOf(10)));
			n = n.divide(BigInteger.valueOf(10));
		}
		return sum.intValue();
	}

	public static BigInteger factorial(BigInteger n){
		if(n.intValue() == 0) return BigInteger.ONE;
		else return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
}
