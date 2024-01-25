package CORE;

public class if_else {
    static void cal(int[]arr){
        for(int a :arr){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        int age= 18;
        boolean cond = (age==19);
        if(cond){
            System.out.println("permit licence");
        }
        else{
            System.out.println("dont permit license");
        }
        cal(new int[]{1, 2, 3});
    }

}
