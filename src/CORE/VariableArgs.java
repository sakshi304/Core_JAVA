package CORE;

public class VariableArgs {
    //1: variable args : int ...arr
    static int add(int ...arr){
                 int result = 0;
                 for (int a : arr){
                      result = result + a;
                 }
                 return result;
       }
    //2: you can use dynamic array initialization while function call instead of Variable args :
    static void sum(int[]arr){
        for(int a: arr){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));   // i guess this might not take space in memory
        sum(new int[]{1,2,3});            //dynamic array initialization //but this will take space in memory
    }
}
