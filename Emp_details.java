import java.util.Scanner;
class Employee{
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
 void print(){
   System.out.println("The Entered details are -");
   System.out.println("The name is : "+name);
   System.out.println("The address is : "+address);
   System.out.println("The age is : "+age);
   System.out.println("The phone number is : "+mob);
   System.out.println("The salary is : "+salary);
 }
  
}

class Officer extends Employee{
 String specialization="AI";
 void display()
 {
  System.out.println("The Specialization is: "+specialization);
 }
}

class Manager extends Employee{
 String department="Computer Science";
 void display()
 {
  System.out.println("The department is: "+department);
 }
}
class Emp_details{
 public static void main(String[] args){
  Officer o=new Officer();
  Manager m=new Manager();
  System.out.println("Enter the details of Officer :");
  o.insert();
  o.print();
  System.out.println("\n");
  System.out.println("Enter the details of Manager :");
  m.insert();
  m.print();
  System.out.println("\n");
  o.display();
  m.display();
 }
}