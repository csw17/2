package fklfdklsp;

public class classexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim=new Student();
		kim.name = "김현우";
		kim.grade=3;
		kim.floor();
		System.out.println("학생의 이름은"+kim.name+"이고 "+kim.grade+"학년입니다");
		Student lee=new Student();
		lee.name="이민우";
		lee.grade=2;
		lee.floor();
		System.out.println("학생의 이름은"+lee.name+"이고"+lee.grade+"학년입니다.");
	}

}
class Student{ 
		String name;
		int grade;
		public void floor(){
			if(grade==3)
				System.out.println("3학년은 4층입니다");
			else if(grade==2)
			System.out.println("2학년은 5층입니다.");
			else
				System.out.println("1학년은 6층입니다.");
		}
		}
