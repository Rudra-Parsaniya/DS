package Lab6;
import java.util.Scanner;

class Employee_Details{
    int Employee_ID;
    String Name;
    String Desingnation;
    double Salary;


void getDetails(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employeen ID");
    Employee_ID = sc.nextInt();
    System.out.println("Enter Employeen Name");
    Name = sc.next();
    System.out.println("Enter Employeen Designation");
    Desingnation = sc.next();
    System.out.println("Enter Employeen Salary");
    Salary = sc.nextDouble();
    sc.close();
}

void displayDetails(){
    System.out.println("Employee ID" + Employee_ID) ;
    System.out.println("Name" + Name);
    System.out.println("Designation" +  Desingnation);
    System.out.println("Salary" + Salary);
}
}

public class EmployeeDetail34 {
    public static void main(String[] args) {
        Employee_Details e1 = new Employee_Details();
        e1.getDetails();
        e1.displayDetails();
    }
    
}

