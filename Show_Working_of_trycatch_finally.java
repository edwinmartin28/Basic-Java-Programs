//Java program to show the usege of try catchand finally.
import java.util.Scanner;
class Show_working_of_trycatch_finally{
    public static void main(String ags[]) throws Exception{
       try{
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter a and b :");
          int a=sc.nextInt();
          int b=sc.nextInt();
          sc.close();
          float ans=a/b;
          System.out.println("Answer ="+ans);
        }catch(Exception e){
          System.out.println(e);
        }finally{
          System.out.println("Program Ended");
        }
     }
}