package days60problemsloving;

public class day1_primes {
	public static void main(String[] args) {
		int a = 39691275;
//		int temp=0;
		
		while (a > 0) {
			int rem = a % 10;
//			int c = 0;
		for (int n = 2; n <= rem; n++) {
			if(rem%n==0) {
				if(rem==n) {
					System.out.println(rem);
				}
				else {
					break;
				}
			}
		}
//				if (rem % n == 0) {
//					c++;
//				}
//			}
//			if (c == 2) {
//				System.out.println("prime " + rem);
//			}

			a = a / 10;
		}

	}

}
