package days60problemsloving;
import java.util.Scanner;
public class Day3_counteven_odd {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		int even=0;
		int odd=0;
		while(a>0) {
			int rem=a%10;
			if(rem%2==0) {
				even++;
			}
			else {
				odd++;
			}
			a=a/10;
		}
		System.out.println("even number are "+even);
		System.out.println("odd number are  "+odd);
		}

}
