
public class Student1 {
           int rollno;
           String qulification;
           String college;

    public Student1(int rollno, String qulification, String college) {
        this.rollno = rollno;
        this.qulification = qulification;
        this.college = college;
    }
       void display()
       {
           System.out.println("Student Roll no:"+rollno);
           System.out.println("Student Qulificarion:"+qulification);
           System.out.println("Student College:"+college);
       }
       public static void main(String[] args) {
        Student1 somnadh=new Student1(12,"B.sc","Miracle");//constructor for intialize an object
        Student1 kiran=new Student1(02,"B.sc","Miracle");
        somnadh.display();
        System.out.println("========================");
        kiran.display();
    }
    
    
}

/* this is an Example for Class and object
Student Roll no:12
Student Qulificarion:B.sc
Student College:Miracle
========================
Student Roll no:2
Student Qulificarion:B.sc
Student College:Miracle*/
