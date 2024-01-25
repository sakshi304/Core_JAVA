package CORE.AccessModifier2;

import CORE.AccessModifier1.Demo1;

public class Demo5 extends Demo1 {                        // Different package ,sub-class,
    public void result(){
        /*
        System.out.println(a+b+c+d);
       */
    }

    public static void main(String[] args) {
            Demo5 r= new Demo5();
            r.result();
    }
}
