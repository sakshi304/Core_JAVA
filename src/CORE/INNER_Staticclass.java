package CORE;

class outer{
    static int x=10;
    int y= 9;
    static class inner{
        void display(){
            System.out.println(x);
//            System.out.println(y);      since y is non-static
        }
    }

}
//class sub extends outer.inner {
//    public void meth() {
//        outer o = new outer();
//        int t = o.y;
//        outer.inner n = new outer.inner();
//        n.display();
//
//    }
//}
public class INNER_Staticclass {
    public static void main(String[] args) {
        outer.inner j= new outer.inner();
        System.out.println("I am main");
        j.display();

    }

}

