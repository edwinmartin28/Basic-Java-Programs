/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' 
and 'Manager' classes have data members 'specialization' and 'department' respectively.
 Now, assign name, age, phone number, address and salary to an employee and a manager by
  making an object of both of these classes and print the same.*/
import java.util.Scanner;
class Member{
 String name, address;
 int age, salary;
 long mob;
 Scanner sc=new Scanner(System.in);
 void insert(){
  System.out.print("Enter the Name :");
  name=sc.nextLine();
  System.out.print("Enter the Address :");
  address=sc.nextLine();
  System.out.print("Enter the Age :");
  age=sc.nextInt();
  System.out.print("Enter the phone number :");
  mob=sc.nextLong();
  System.out.print("Enter the salary:");
  salary=sc.nextInt();
 }
 void printSalary(){
   System.out.println("The Entered details are -");
   System.out.println("The name is : "+name);
   System.out.println("The address is : "+address);
   System.out.println("The age is : "+age);
   System.out.println("The phone number is : "+mob);
   System.out.println("The salary is : "+salary);
 }
  
}

class Employee extends Member{
 String specialization="AI";
 void display()
 {
  System.out.println("The Specialization is: "+specialization);
 }
}

class Manager extends Member{
 String department="Computer Science";
 void display()
 {
  System.out.println("The department is: "+department);
 }
}
class t2{
 public static void main(String[] args){
  Employee e = new Employee();
  Manager m=new Manager();
  System.out.println("Enter the details of Officer :");
  e.insert();
  e.printSalary();
  e.display();
  System.out.println("\n");
  System.out.println("Enter the details of Manager :");
  m.insert();
  m.printSalary();
  m.display();
 }
}