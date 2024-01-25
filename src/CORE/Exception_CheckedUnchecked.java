package CORE;

class UserDefined extends Exception{
    @Override
    public String toString(){
        return "I am user defined exception";
    }


}
public class Exception_CheckedUnchecked {

    static void userdef(){
        try {
            int amount = 52;
            if (amount < 100) {
                throw new UserDefined();    //you need to create object of your user defined exception like this always
            }
        } catch (UserDefined e) {
            // Handle the exception
            System.out.println(e);
        }
    }

    static void meth1(){
         //  int t= -9999999999999999999999999999;    // compile time exception = checked exception    YOU WILL SEE THAT WHILE COMPILING i.e in BUILD OUTPUT below it throws a compile time exception
         //   System.out.println(10/0);               // runtime time exception = unchecked exception  FILE GETS COMPILED AND THROWS EXCEPTION AFTER RUNNING
    }
    static void meth2(){
        meth1();
    }
    static void meth3(){
        meth2();
    }
    public static void main(String[] args) {
        meth3();
        userdef();
    }
}
