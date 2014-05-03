import java.math.BigInteger;

public class Problem016 {
	public static void main(String[] args) {
		BigInteger bi = new BigInteger("2");
		bi = bi.pow(1000);
		System.out.println(addDigits(bi.toString()));
	}
	
	public static int addDigits(String in){
		int sum = 0;
		for(int i = 0; i < in.length(); i++){
			sum += Integer.parseInt(new Character(in.charAt(i)).toString());
		}
		return sum;
	}
}
