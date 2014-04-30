//https://projecteuler.net/problem=5
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Problem005 {
	public static void main(String[] args){
		System.out.println(calculate());
	}
	
	public static int calculate(){
		int smallest = -1;
		
		for(int i = 2520; i < Integer.MAX_VALUE; i++){
			if(isDiv(i)) return i;
		}
		
		return smallest;
	}
	
	public static boolean isDiv(int n){
		for(int i = 1; i <= 20; i++){
			if(n%i == 0) continue;
			else return false;
		}
		return true;
	}
	
}
