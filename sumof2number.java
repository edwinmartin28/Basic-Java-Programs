import java.util.Scanner;
class sumof2number{
 public static void main(String srgs[]){
 int n1,n2,sum=0;
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter First Number :");
 n1 = sc.nextInt();
 System.out.println("Enter Second Number :");
 n2 = sc.nextInt();
 sc.close();
 sum=n1+n2;
 System.out.println("Sum ="+sum);
 }
}
 
