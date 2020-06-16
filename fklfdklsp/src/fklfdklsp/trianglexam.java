package fklfdklsp;


public class trianglexam{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle tr=new triangle(10.2,17.3);
			System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ:"+tr.getarea());
		tr.setsize(7.9, 9.2);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ"+tr.getarea());
	}

}

class triangle {
	double bottom;
	double height;
	public triangle(double bt, double hg) {
		bottom=bt;
		height=hg;
	}
	public void setsize(double bt, double hg) {
		bottom=bt;
		height=hg;
	}
	public double getarea() {
		return bottom*height/2;
	}
}
	