//Java program to check whether a given number is a Armstrong number
import java.util.Scanner;
public class Armstrong_number{
    public static void main(String args[]){
        int num,d,cube=0,copy;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num=sc.nextInt();
        sc.close();
        copy=num;
        while(num!=0){
          d=num%10;
          cube=cube+(d*d*d);
          num=num/10;
        }
        if (cube==copy)
         System.out.println("The given number is a Armstrong number");
        else
         System.out.println("The given number is not a Armstrong number");
    }    
}