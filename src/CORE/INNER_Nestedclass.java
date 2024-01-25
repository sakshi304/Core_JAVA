package CORE;

class Outer
{

    static int x=10;
    Inner i=new Inner();

    class Inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }


    void outerDisplay()
    {

        i.innerDisplay();                      //nested classes cannot be directly accessed in outside class ; hence object creation is necessary
        System.out.println(i.y);

    }
}

//class demo extends Outer.Inner{         cannot do this as Inner is non-static
//
//}

public class INNER_Nestedclass {

    public static void main(String[] args)
    {
        Outer.Inner oi=new Outer().new Inner();                 // inner class object creation
        oi.innerDisplay();
        Outer o= new Outer();
        o.outerDisplay();

    }

}