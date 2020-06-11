package fklfdklsp;
import java.util.Scanner;
public class GradeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("수학, 과학, 영어");
		Grade me=new Grade();
		me.math=scn.nextInt();
		me.science=scn.nextInt();
		me.english=scn.nextInt();
		System.out.println("평균"+me.average());
	}

}
class Grade{
	int math;
	int science;
	int english;
	
	public class average(){
		return (math+science+english/3);
	}
}
