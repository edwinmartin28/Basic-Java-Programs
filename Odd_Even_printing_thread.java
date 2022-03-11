class display{
    public synchronized void print(int a){
    if(a==2)
     System.out.println("\nEven Numbers 1 to 100");
    else
     System.out.println("\nOdd Numbers 1 to 100");
    for(int i=a;i<=100;i+=2)
     System.out.print(i+" ");
    System.out.println("\n");
    }
    
   }
   class oddeven extends Thread{
    display d;
    int a;
    oddeven(display d,int a) {
    this.d=d;
    this.a=a;
    }
    public void run(){
    d.print(a);
    }
   }
   class Odd_Even_printing_thread{
    public static void main (String[] args){
    display d=new display();
    oddeven ob1=new oddeven(d,2);
    oddeven ob2=new oddeven(d,1);
    ob1.start();
    ob2.start();
    }
   }
   