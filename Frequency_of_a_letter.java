//Java program to check the frequency of a character in a string
import java.util.Scanner;
public class Frequency_of_a_letter {
    public static void main(String args[]){
        String a;
        char b;
        int i,n,count = 0;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the String :");
        a =sc.nextLine();
        System.out.print("Enter a letter checking the frequency :");
        b =sc.next().charAt(0);
        sc.close();
        n =a.length();
        for(i=0;i<=n-1;i++){
         if(a.charAt(i)==b)
         {
             count++;
         } 
        }
        System.out.print("The count of the given character is : "+count);
       }
    
}
