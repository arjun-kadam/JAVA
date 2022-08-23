//Code Editor Used For This Code is Simple NotePad
package Com.Arjun.Shapes;

class Rect{
  void Volume(int a, int b){
      System.out.println("Volume is "+(a+b));
   }
}
class Square{
  void Volume(int a){
    System.out.println(a*a);
 }
}
 class Circle{
    void Area(int rad){
      System.out.println(Math.PI*rad*rad);
  }
}
class Cylinder{
    void Volume(int rad, int h){
       System.out.println(Math.PI*rad*rad*h);
  }
}

public class Shapes{
      public static void main(String [] args){
       Rect r1=new Rect();
       Square sq1=new Square();
       Circle c1=new Circle();
       Cylinder cl1=new Cylinder();
       r1.Volume(10,20);
       sq1.Volume(4);
       c1.Area(3);
       cl1.Volume(2,4);
  }
}