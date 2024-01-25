package CORE;
/////////------------------------------IT TOOK AROUND 3 HRS TO WRITE THIS CODE ON MY OWN-----------------------------
import java.util.*;

class underflow extends Exception{
    public String toString(){
        return "Stack is empty ";
    }
}

class overflow extends Exception{
    public String toString(){
        return "Stack is full ";
    }
    public void show(){
        System.out.println("hello");
    }

}
class stack{
    static int[] array= new int[5];
    static int top=-1;

    public static void push(int i)throws overflow{

        if(top==array.length){
            throw new overflow();
        }
        System.out.println("TOP :"+top);
        System.out.println("Enter the element"+i);
        Scanner sc=new Scanner(System.in);
        array[i]=sc.nextInt();

    }

    public static void pop(int i)throws underflow{
        if(top==-1){
            throw new underflow();
        }

        System.out.println(array[i]+"is poped");
        array[i]=0;
    }


}
public class Exception_prac{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello world");

        stack t= new stack();
        String y="yes";
        int i=0;
        try{
            while(Objects.equals(y, "yes")){
                stack.top++;
                stack.push(i);

                i++;
                System.out.println("Enter element yes/no");
                y=sc.nextLine();




            }
        }catch(overflow e){
            System.out.println(e);
        }
        stack.top=stack.top-1;
        try{
            for(int j=i-1;-1<=j;j--){

                stack.pop(j);
                stack.top--;


            }
        }catch(underflow e){
            System.out.println(e);
        }

    }
}
