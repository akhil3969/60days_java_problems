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

