//Java program for checking wheather a number is prime or not
import java.util.Scanner;
class Prime_number{
        public static void main(String[] args){
            int i, num;
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the Number: ");
            num =sc.nextInt();
            sc.close();
            for(i=2;i<=num/2;i++){
                if(num%i == 0){
                System.out.println("The Number is not prime.");
                System.exit(0);
                }
            }
            System.out.println("The Number is prime.");
        }
}
