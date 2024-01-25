package Lambda_Exp;


@FunctionalInterface
interface Mylambda2{
    public void display(String s);
}

@FunctionalInterface
interface Mylambda3{
    public int sum(int a,int b);
}
public class  Parametric_Lambda  {
    public static void main(String[] args) {
        Mylambda2 m1=(s)->{
            System.out.println(s);
        };
        m1.display("HELLO LAMBA");

        Mylambda3 m3=(a,b)->a+b;                       // no need to write : return a+b;
        System.out.println(m3.sum(2,3));
    }
}
