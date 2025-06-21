package Binary_search.Two_D_Array;

class Student{
    String Name;
    String course;
    int rollNumber;

    Student(){
        System.out.println("this is a constructor");
    }
    Student(String course,int rollNumber ){
       System.out.println(this);
      this.course=course;
      this.rollNumber=rollNumber;
    }

    Student(String course,int rollNumber,String Name ){
        this.course=course;
        this.rollNumber=rollNumber;
        this.Name=Name;
    }

    void getStudentName(){
        System.out.println("name : "+ this.Name);
    }
    void getStudentCourse(){
        System.out.println("course :"+this.course);
    }
    void getStudentRollNumber(){
        System.out.println(" RollNumber :"+this.rollNumber);
    }
}

public class KavyaTest {
    public static void main(String[] args) {

     Student  kavya=new Student("MCA" ,28);
     Student navya =new Student("MCA",34);

      kavya.getStudentRollNumber();
      navya.getStudentRollNumber();

    }
}
