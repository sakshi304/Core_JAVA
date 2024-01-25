package CORE;

abstract class shape{
    public abstract void perimeter();
    public abstract void area();
    public void my(){

    }
}

class circle extends shape{
    int radius;
    public void perimeter(){
        System.out.println("Perimeter of circle: "+2*Math.PI*radius);
        }
    public void area(){
        System.out.println("area: "+Math.PI*Math.pow(radius,2));
    }
    public void circ(){

    }

}
class square extends shape{
    int s;
    public void perimeter(){
        System.out.println("Perimeter of square: "+4*s);
    }
    public void area(){
        System.out.println("area: "+Math.pow(s,2));
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        shape[] t=new shape[2];

//        shape s= new shape();     not allowed

        shape s= new circle();    // allowed   //This is UPCASTING
        s.area();
        circle c= new circle();
        c.radius= 4;
        c.perimeter();
        c.area();
    }
}
