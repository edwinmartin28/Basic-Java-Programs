//Implement a calculator by handling all exceptions.
import java.util.Scanner;
class Simple_Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s;
        do{
            try{
            System.out.print("Enter two arguments :");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("+ for Addition\n- for Substraction\n/ for Division\n* for Multiplication");
            System.out.print("Enter your choice :");
            char x=sc.next().charAt(0);
             switch(x){
                case '+':System.out.println("Answer="+(a+b) );
                         break;
                case '-':System.out.println("Answer="+(a-b));
                         break;
                case '/':{
                            if(b==0) throw new ArithmeticException("Division by 0");
                            System.out.println("Answer="+((float)a/(float)b) );
                        }
                         break;
                case '*':System.out.println("Answer="+(a*b) );
                         break;
                default :System.out.println("Invalid Choice!!");
             }
            }catch(Exception e){
               System.out.println(e);
            }
            System.out.print("Do you want to continue(y/n) : ");
            s=sc.next();
        }while(s.equalsIgnoreCase("y"));
        sc.close();
    }
}
