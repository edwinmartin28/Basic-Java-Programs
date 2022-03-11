class display{
    public synchronized void print1to50(){
     System.out.println("\nNumbers 1 to 50");
    for(int i=1;i<=50;i++)
     System.out.print(i+" ");
    System.out.println("\n");
    } 
    public synchronized void printprime(){
     System.out.println("\nPrime Numbers 1 to 100");
     for(int i=2;i<=100;i++){
      int flag=0;
      for(int j=2;j<i/2;j++){
        if(i%j==0){
         flag=1;
         break;
      }
    }
    if(flag==0)
      System.out.print(i+" ");
    }
    System.out.println("\n");
    }
    
    public synchronized void odd1to100(){
      System.out.println("\nOdd Numbers 1 to 100");
    for(int i=1;i<=100;i+=2)
      System.out.print(i+" ");
    
     System.out.println("\n");
    }
    
}
class oddeven extends Thread{
    display d;
    int a;
    oddeven(display d,int a){
     this.d=d; 
     this.a=a;
    }
    public void run(){
    switch(a){
     case 1:d.print1to50();break;
     case 2:d.printprime();break;
     case 3:d.odd1to100();break;
    }
    }
}
class Odd_prime_1to50_printing_thread{
    public static void main (String[] args){
     display d=new display();
     oddeven ob1=new oddeven(d,1);
     oddeven ob2=new oddeven(d,2);
     oddeven ob3=new oddeven(d,3);
     ob1.start();
     ob2.start();
     ob3.start();
    }
}
   
