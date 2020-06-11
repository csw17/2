
package fklfdklsp;

import java.util.Scanner;
public class AddExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("a 입력");
		a=sc.nextInt();
		System.out.println("b 입력");
		b=sc.nextInt();
		int sum=0;
		
		for(int i=a; i<=b; i++) {
			sum=sum+i;
			
		}
		System.out.println(a+"부터"+b+"까지의 합"+sum);
	}

}