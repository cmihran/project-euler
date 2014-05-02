package test;

import java.io.File;
import java.util.Scanner;

public class Problem014 {
	private static int steps = 0;
	private static int PrintWriter pw = new PrintWriter(new File("output.out"));
	
	public static void main(String[] args){
		startChain(500);
		System.out.println(steps);
		//findLongestSteps(999999);
	}
	
	public static void findLongestSteps(int max){
		int largestStepStart = 0, largestSteps = 0;
		for(int i = max; i > max - 800; i--){
			startChain(i);
			if(steps > largestSteps){
				largestSteps = steps;
				largestStepStart = i;
			}
		}
		System.out.println(largestStepStart + " with steps " + largestSteps);
		
	}
	
	public static int startChain(int start){
		steps++;
		System.out.print(start + " ");
		if(start%2 != 0) return oddNext(start);
		else return evenNext(start);
	}
	
	public static int oddNext(int n){
		steps++;
		if(n == 1) return 1;
		int retval = 3 * n + 1;
		System.out.print("--> " + retval + " ");
		if(retval%2 != 0) return oddNext(retval);
		else return evenNext(retval);
	}
	
	public static int evenNext(int n){
		steps++;
		if(n == 1) return 1;
		int retval = n/2;
		System.out.print("--> " + retval + " ");
		if(retval%2 != 0) return oddNext(retval);
		else return evenNext(retval);
	}
}
