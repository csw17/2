
package fklfdklsp;

import java.util.Scanner;
public class AddExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("a �Է�");
		a=sc.nextInt();
		System.out.println("b �Է�");
		b=sc.nextInt();
		int sum=0;
		
		for(int i=a; i<=b; i++) {
			sum=sum+i;
			
		}
		System.out.println(a+"����"+b+"������ ��"+sum);
	}

}