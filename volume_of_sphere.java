//Java program to find the volume of sphere.
class Sphere{
     int r;
     Sphere(int w) 
     {
         r = w;
     }
     int Volume()
     {
         return (4*22*r*r*r)/(3*7);
     }
}
class volume_of_sphere{
    public static void main(String[] args){
        float volume;
        Sphere s1 = new Sphere(5);
        volume = s1.Volume();
        System.out.println("Volume = " + volume);
    }
}