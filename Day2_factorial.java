package days60problemsloving;

import java.util.Scanner;

public class Day2_factorial {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the input");
		int a=ob.nextInt();
		int sum=1;
		for(int i=1;i<=a;i++) {
			sum=sum*i;
		}
		System.out.println(sum);
		ob.close();
	}

}
