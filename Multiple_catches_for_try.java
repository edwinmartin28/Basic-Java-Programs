//JAVA program Illustrating Multiple catch clauses
import java.util.*;
public class Multiple_catches_for_try{  
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter two numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.close();    
            float c=a/b;  
            System.out.println("Answer ="+c);  
        }catch(ArithmeticException e){  
         System.out.println("Arithmetic Exception occurs");  
        }catch(Exception e){  
         System.out.println(e);  
        }System.out.println("Rest of the code");    
    }  
}  
