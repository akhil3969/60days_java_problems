package days60problemsloving;

public class day1_fibnoic {

		public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<10;i++) {
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
			
		}
	
		}
}

//    public static void main(String[] args) {
//        int n = 10; // Number of terms
//        int a = 0, b = 1;
//
//        System.out.print("Fibonacci Series: " + a + " " + b);
//
//        for (int i = 2; i < n; i++) {
//            int next = a + b;
//            System.out.print(" " + next);
//            a = b;
//            b = next;
//        }
//    }
//}
