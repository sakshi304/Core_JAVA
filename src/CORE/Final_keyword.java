package CORE;

class Father {
    public final void show()
    {
        System.out.println();
    }
}

class son extends Father
{
    //public void show(){}
    //gives error as final methods cannot be overloaded.
}

public class Final_keyword {

    final float PI;
//    PI =3.14f;  you cant do this outside psvm!!!!!!
    public Final_keyword()     //CONSTRUCTOR
    {
        PI=3.1425f;
    }
    //// OR //////
    /*
    {                          // INSTANCE BLOCK
        PI=3.1425f;
    }
    */

    public static void main(String[] args) {

        final float PI;
        PI=3.1425f;
        System.out.println(PI);

    }

}
