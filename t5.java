//JAVA program to implement Interface. 
interface printable{  
    void print();  
}  
class show implements printable{  
    public void print(){
        System.out.println("Hello World!!");
    }
}  
class t5{
  public static void main(String args[]){  
    show obj = new show();  
    obj.print();  
  }  
}  