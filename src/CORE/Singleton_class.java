package CORE;

/////////////////////// PROGRAM TO RESTRICT OBJECT CREATION TO ONE ONLY ///////////////////////////////////////////
class Singleton{

    static private Singleton instance= null;  // variable of type class (i.e an object) its the reference to the object
    private Singleton(){                      // constructor made as private to prevent direct instantiation by other class
        System.out.println("hello");
    }

    static public Singleton getInstance(){    // method of return type class hence it needs to return the reference variable

        if(instance==null){
            instance=new Singleton();
        }

        return instance;
    }
}

public class Singleton_class {
    public static void main(String[] args) {
        Singleton m1= Singleton.getInstance();
        Singleton m2= Singleton.getInstance();
        Singleton m3= Singleton.getInstance();



        System.out.println("m1: "+m1+"\nm2: "+m2+"\nm3: "+m3);    // m5 and m6 give reference to the same address
    }
}



/////////////////////////////////// PROGRAM TO CREATE "n" OBJECTS ONLY !!!  //////////////////////////////
/*
class Singleton{

    static private int counter=5;             // holds the count for number of objects created
    static private Singleton instance= null;  // variable of type class (i.e an object) its the reference to the object
    private Singleton(){                      // constructor made as private to prevent direct instantiation by other class
        System.out.println("hello");
    }

    static public Singleton getInstance(){    // method of return type class hence it needs to return the reference variable

        if(instance==null){
            instance=new Singleton();
            counter--;
            System.out.println("counter :"+counter);
        }
        else if (instance!=null && counter>0) {
            instance=new Singleton();
            counter--;
            System.out.println("counter :"+counter);

        }

        return instance;
    }
}

public class Singleton_class {
    public static void main(String[] args) {
        Singleton m1= Singleton.getInstance();
        Singleton m2= Singleton.getInstance();
        Singleton m3= Singleton.getInstance();
        Singleton m4= Singleton.getInstance();
        Singleton m5= Singleton.getInstance();
        Singleton m6= Singleton.getInstance();   // once the object creation limit gets crossed ;
                                                 // now m6 onwards further objects will refer to the same object as that of m5


        System.out.println("m1: "+m1+"\nm2: "+m2+"\nm3: "+m3+"\nm4: "+m4+"\nm5: "+m5+"\nm6: "+m6);    // m5 and m6 give reference to the same address
    }
}
*/