package Lambda_Exp;
@FunctionalInterface
interface Mylambda4{
    public void display();
}

class Uselammbda{
    public void show(Mylambda4 m){       // functional interface as parameter
        m.display();
    }
}
class Demo{
    int temp=0;         //instance variable
    public  void meth2(){
        Uselammbda x=new Uselammbda();
        x.show(()->{System.err.println("Hello");});
    }

    public void meth1(){

        int count=0;
        final int chaman=0;
        Mylambda4 m4=()->{
            System.out.println(temp++);
           // System.out.println(++count);  local variable increment not allowed
            System.out.println(chaman);
        };
        m4.display();
    }
}
public class Capture_in_lambexp {
    public static void main(String[] args) {
        Demo d= new Demo();
        d.meth1();
        int f = d.temp;
    }
}
