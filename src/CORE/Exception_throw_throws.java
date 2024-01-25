package CORE;

public class Exception_throw_throws {
    static int meth1(int l,int b)throws Exception{               //you can write user-defined exception also refer notebook
        if(l<0 || b<0){
            throw new Exception("Input cannot be negative");
        }
        return l*b;
    }
    static void meth2()throws Exception{
        System.out.println(meth1(-10,2));
    }
    public static void main(String[] args) throws Exception {
        try {
            meth2();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


/*
* you can write user-defined exception also refer notebook
 */