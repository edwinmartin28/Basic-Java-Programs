/*a program to create a class named shape. In this class we have three sub 
classes circle, triangle and square each class has two member function named draw () 
and erase (). Create these using polymorphism concepts */
class shape{
    void draw(int n){
        System.out.println("Shape drawn");
    }
    void erase(int n){
        System.out.println("Shape erased");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("Circle drawn");
    }
    void erase(){
        System.out.println("Circle erased");
    }
}
class triangle extends shape{
    void draw(){
        System.out.println("Triangle drawn");
    }
    void erase(){
        System.out.println("Triangle erased");
    }
}
class square extends shape{
    void draw(){
        System.out.println("Square drawn");
    }
    void erase(){
        System.out.println("Square erased");
    }
}
class t3{
    public static void main(String[] args){
     circle c=new circle();
     c.draw();
     c.erase();
     c.draw(1);
     c.erase(1);
     triangle t=new triangle();
     t.draw();
     t.erase();
     t.draw(1);
     t.erase(1);
     square s=new square();
     s.draw();
     s.erase();
     s.draw(1);
     s.erase(1);  
    }
}
