package CORE;

import java.util.Scanner;

public class recursive_function {
    // Fibo Sequence
    static int fibo(int i){

        if(i<=1){
            return i;
        }
        else{
            return fibo(i-1)+fibo(i-2);                                // agar call aya fib(2): fib(1)+fib(0) fir ye log call lagaenge aur jo value hai voh else ke return statement store hogi
        }
    }

    // sum of 1st n natural nos
    static int sumOfNaturalNo(int n){
        if(n==1){
            return n;
        }
        else{
            return n+ sumOfNaturalNo(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("enter number of terms :");
        int t= n.nextInt();
        for(int i=0; i<t;i++){
            System.out.print(fibo(i)+" ");
        }

        System.out.println("\nEnter no of natural no:");
        int x= n.nextInt();
        System.out.println("sum of 1st "+x+" natural nos is:"+sumOfNaturalNo(x));
    }
}
