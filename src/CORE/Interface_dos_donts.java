package CORE;

interface Test
{
    final static int X=10;
    final int i=10;
    static int u =10;    ////------------HOVER THE MOUSE OVER THOSE KEYWORDS STATIC AND FINAL---------;
    int y=23;   // --------------BY DEFAULT IDENTIFIERS IN INTERFACE ARE FINAL AND STATIC;
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
    private void meth5(){
        System.out.println("private method function can be defined for an abstract class.");
    }
    default void hello(){
        meth5();
    }
}


interface Test2 extends Test
{
    void meth4();
    int t= Test.u;
    int r= Test.y;
    //---WHOSE BODY ARE ALLOWED-------
    private void show(){

    }
    default void show2(){

    }
    static void show3(){

    }
//    public void show4(){          --------(throws error)
//
//    }

}


class My implements Test2
{

    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
public class Interface_dos_donts
{
    public static void main(String[] args)
    {
        System.out.println(Test.X);
        Test.meth3();
//        Test t= new Test();   interface cant be instantiated
        My x= new My();
        x.meth1();

    }
}

