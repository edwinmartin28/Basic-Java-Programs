import java.util.Scanner;
class Palindrome_String{
 public static void main(String args[]){
  String a,b="";
  int i,n;
  Scanner sc =new Scanner (System.in);
  System.out.println("Enter the String :");
  a =sc.nextLine();
  sc.close();
  n =a.length();
  for(i=n-1;i>=0;i--){
   b = b + a.charAt(i);
  }
  if(a.equals(b)){
   System.out.println("The entered is a Palindrome.");
  }
  else
  {
   System.out.println("The entered is a not Palindrome.");
  }
 }
}
    
