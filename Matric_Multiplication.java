import java.util.Scanner;
class Matric_Multiplication{
  public static void main(String args[]){
   int r1,r2,c1,c2,i,j,k;
   int a[][] =new int[50][50];
   int b[][] =new int[50][50];
   int c[][] =new int[50][50];
   Scanner sc =new Scanner(System.in);
   System.out.print("Enter the Order of first Matrix :  ");
   r1 =sc.nextInt();
   c1 =sc.nextInt();
   System.out.print("Enter the Order of second Matrix :  ");
   r2 =sc.nextInt();
   c2 =sc.nextInt();
   if(c1==r2)
   {
     System.out.println("Enter Elements of first Matrix :  ");
     for(i=0;i<r1;i++)
      for(j=0;j<c1;j++)
      {
       a[i][j]=sc.nextInt();
      }
     System.out.println("Enter Elements of second Matrix :  ");
     for(i=0;i<r1;i++)
      for(j=0;j<c1;j++)
      {
       b[i][j]=sc.nextInt();
      }
     for(i=0;i<r1;i++)
      for(j=0;j<c2;j++)
      {
       c[i][j]=0;
       for(k=0;k<c1;k++)
        {
         c[i][j]=c[i][j]+a[i][k]*b[k][j];
        }  
      }
     System.out.println("Products :  ");
     for(i=0;i<r1;i++)
     {
      for(j=0;j<c2;j++)
      {
        System.out.print("\t"+c[i][j]);
      }
      System.out.print("\n");
     }
   sc.close();
   }
   else
    System.out.println("Multiplication is not possible!");
 }
}

   
