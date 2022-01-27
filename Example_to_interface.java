//JAVA program to implement Interface. 
interface printable{  
    void print();  
}  
class show implements printable{  
    public void print(){
        System.out.println("Hello World!!");
    }
}  
class Example_to_interface{
  public static void main(String args[]){  
    show obj = new show();  
    obj.print();  
  }  
}  
