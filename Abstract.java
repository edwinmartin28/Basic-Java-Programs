abstract class Shape{
 abstract void numberofsides();
}
class Triangle extends Shape{
 void numberofsides(){
  System.out.println("The Number of Sides of triangle is 3 ");
 }
}
class Rectangle extends Shape{
 void numberofsides(){
  System.out.println("The Number of Sides of rectangle is 4 ");
 }
}
class Hexagon extends Shape{
 void numberofsides(){
  System.out.println("The Number of Sides of hexagon is 6 ");
 }
}
class Abstract{
 public static void main(String args[]){
  Triangle t = new Triangle();
  Rectangle r = new Rectangle();
  Hexagon h = new Hexagon();
  Shape shapef;
  shapef = t;
  shapef.numberofsides();
  shapef = r;
  shapef.numberofsides();
  shapef = h;
  shapef.numberofsides();
 }
}
