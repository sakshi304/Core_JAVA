package CORE;
/*
1. Static variables
2. Static Methods
3. Static Nested class
4. Static Blocks

*/

// STATIC BLOCK:

class Testing
{
    static
    {
        System.out.println("Block 1");
    }

    static
    {
        System.out.println("Block 2");
    }
}

public class Static{



    /*static
    {
        System.out.println("Block 1");
    }*/


    public static void main(String[] args)
    {
        //Test t=new Test();
        System.out.println("Main");
        Testing t=new Testing();
    }

    /*static
    {
    System.out.println("Block 2");
    }*/

}

/*

// STATIC VARIABLES:

class Test
{
    static int x=10;
    int y=20;

    void show()
    {
        System.out.println(x+" "+y);
    }

    static void display()
    {
        System.out.println(x);
    }
}

public class Static {

    public static void main(String[] args) {

        Test.display();
        Test t1=new Test();
        t1.show();
        t1.x=30;
        t1.y=50;

        Test t2=new Test();
        t2.show();

    }

}

*/