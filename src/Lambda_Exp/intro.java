package Lambda_Exp;
@FunctionalInterface
interface Mylambda{
    public void display();
}

public class intro {
    public static void main(String[] args) {
        Mylambda m1=()->{
            System.out.println("HELLO LAMNBDAS");
        };
        m1.display();
    }
}
