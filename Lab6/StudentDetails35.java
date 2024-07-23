package Lab6;
import java.util.Scanner;
public class StudentDetails35 {
    public static void main(String[] args) {
        Student_detail[] student = new Student_detail[5];
        for(int i=0 ; i<5 ; i++){
            student[i] = new Student_detail();

            System.out.println("Enter student details "+(i+1));
            student[i].getDetail();
            student[i].setDetail();
        }
    }
}
class Student_detail{
    Scanner sc = new Scanner(System.in);
    int enrollment_no;
    String name;
    int semester;
    double CPI;
    public void getDetail(){
        System.out.println("Enter enrollment_no");
        enrollment_no = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter semester");
        semester = sc.nextInt();
        System.out.println("Enter CPI");
        CPI = sc.nextDouble();
    }
    public void setDetail(){
        System.out.println("Enrollment_No "+enrollment_no);
        System.out.println("Name "+name);
        System.out.println("Semester "+semester);
        System.out.println("CPI "+CPI);
    }
}