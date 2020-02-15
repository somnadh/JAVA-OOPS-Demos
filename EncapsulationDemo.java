class Encapdemo {
	private int m1;
	private int m2;
	private int m3;

	
	
	public Encapdemo(int m1, int m2, int m3) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public void display()
	{
		System.out.println("Subject 1 marks "+m1);
		System.out.println("Subject 1 marks "+m2);
		System.out.println("Subject 1 marks "+m3);
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	
}

public class EncapsulationDemo{
	public static void totalMarks(Encapdemo object)
	{
		int total=object.getM1()+object.getM2()+object.getM3();
		System.out.println("Toatal Marks"+total);
	}
	public static void changeMarks(Encapdemo object)
	{
		object.setM1(100);
		object.setM2(100);
		object.setM3(100);
	}
	 public static void main(String[] args) {
	        Encapdemo oj= new Encapdemo(12,78,79);//Intializing values
	        oj.display();//display marks
	        totalMarks(oj);//gives total marks 
	        System.out.println("=========================");
	        changeMarks(oj);//here change marks
	        oj.display();//again display
	        totalMarks(oj);//total
	    
	    }

}

/* here every data can accessed through method not directly so here data is private
so we could't access data directly
Final statement for Encapsulation data should be private+methods should be public

OUTPUT:
Subject 1 marks 12
Subject 1 marks 78
Subject 1 marks 79
Toatal Marks169
=========================
Subject 1 marks 100
Subject 1 marks 100
Subject 1 marks 100
Toatal Marks300

*/