package days60problemsloving;

import java.util.Scanner;

public class Day_3_Largestdigit {
public static void main(String[] args) {
	Large();
}
public static void Large() {
	Scanner ob=new Scanner(System.in);
	int a=ob.nextInt();
	int L=0;
	while(a>0){
		int rem=a%10;
		if(rem>L) {
			L=rem;
			
		}
		a=a/10;
	}
	System.out.println(L);
}
}
