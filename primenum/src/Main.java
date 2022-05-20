public class Main {

	public static void main(String[] args) {
		int div, num;
		for (num = 2; num < 1000; num++) {
			boolean isPrime = true;
			for (div = 2; div < num; div++) {
				if (num % div == 0) {
					isPrime = false;
					break;
				}
			}
				if (isPrime) {
					System.out.println(num);
				}
			}
		}
	}

