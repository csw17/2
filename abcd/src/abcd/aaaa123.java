package abcd;

import java.util.Scanner;

public class aaaa123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int a;
		int b;
		int c=8000;
		int price=0;
		System.out.print("아동추가 :");
		a=sc.nextInt();
		System.out.print("어른 추가:");
		b=sc.nextInt();
		
		System.out.println("총수량 :"+(a+b));
		
		price=(c-6000)*a+c*b;
		
		System.out.println("금액 : "+price);
		
	}

}
