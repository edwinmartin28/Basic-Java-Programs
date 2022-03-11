import java.util.*;
import java.io.*;
class Palindrome_in_File{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    try{ 
     System.out.println("Enter the String : ");
     String s=sc.nextLine();
     FileWriter fw=new FileWriter("file1.txt");
     fw.write(s);
     fw.close();
     char ch[]=new char[1000];
     FileReader fr=new FileReader("file1.txt");
     fr.read(ch);
     fr.close();
     sc.close();
     String s1,s2="";
     s1=String.valueOf(ch);
     int n=s1.length();
     for(int i=n-1;i>=0;i--)
      s2+=s1.charAt(i);
     System.out.println("s1:"+s1);
     System.out.println("s2:"+s2);
     if(s1.equals(s2)==true){
         System.out.println(s1+" is a Palindrome");
     }
     else
       System.out.println(s1+" is not a Palindrome");
      }catch(Exception e){
       System.out.println(e); 
     }
  }
}
