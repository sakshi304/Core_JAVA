package CORE;


class dusra{
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        x = 566;
        return z;
    }
}
public class Static_nonstatic_method {
    //    static int logic(int x, int y){
//        int z;
//        if(x>y){
//            z = x+y;
//        }
//        else {
//            z = (x +y) * 5;
//        }
//        x = 566;
//        return z;
//    }
//   int logic(int x, int y){                           // this method needs object creation
//        int z;
//        if(x>y){
//            z = x+y;
//        }
//        else {
//            z = (x +y) * 5;
//        }
//        x = 566;
//        return z;
//    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int t;
        // Method invocation using Object creation
        //Methods_in_java_static_nonstatic obj = new Methods_in_java_static_nonstatic();
        //c = obj.logic(a, b);


        t = dusra.logic(a, b);
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = dusra.logic(a1, b1);
//        System.out.println(c);
        System.out.println(c1);


    }

}
