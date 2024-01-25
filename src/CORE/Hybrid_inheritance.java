package CORE;

//parent class
class GrandFather
{
    int x=10;
    public void show()
    {
        System.out.println("I am grandfather.");
    }
    public void window(){

    }
}
//inherits GrandFather properties
class Fathr extends GrandFather
{
    public void show()
    {
        System.out.println("I am father.");
    }
}
//inherits Father properties
class Son extends Fathr
{
    public void show()
    {
        System.out.println("I am son.");
    }
    @Override
    public void window(){
        System.out.println("I am grandfathers variable x: "+x);
    }
}
//inherits Father properties
public class Hybrid_inheritance extends Fathr
{
    public void show()
    {
        System.out.println("I am a daughter.");
    }
    public static void main(String args[])
    {
        Hybrid_inheritance obj = new Hybrid_inheritance();
        obj.show();
    }
}
