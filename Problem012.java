public class Problem012 {
	public static void main(String[] args) {
		for (int i = 7; i < Integer.MAX_VALUE; i++) {
			if (findFactors(generateNum(i)) >= 500) {
				System.out.println(generateNum(i));
				break;
			}
		}

	}

	public static int generateNum(int k) {
		int retval = 0;
		for (int i = 0; i <= k; i++) {
			retval = retval + i;
		}
		return retval;
	}

	public static int findFactors(int k) {
		int counter = 0;
		if (k % 2 == 1) {
			for (int i = 1; i <= k; i = i + 2) {
				if (k % i == 0) {
					counter++;
				}
			}
		} else {
			for (int i = 1; i <= k; i++) {
				if (k % i == 0) {
					counter++;
				}
			}
		}
		return counter;
	}

}
