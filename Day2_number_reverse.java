package days60problemsloving;
import java.util.Scanner;
public class Day2_number_reverse {
  public static void main(String[] args) {
	reverse();
	
	
  }
	public static void reverse() {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the number");
		int a=ob.nextInt();
		int sum=0;
		while(a>0) {
		 
			int rem=a%10;
			sum=sum*10+rem;
			a=a/10;

		}
		System.out.println(sum);
	ob.close();
}
  }
