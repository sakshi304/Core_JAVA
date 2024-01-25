package CORE.Revision;

public class primitive_and_reference_datatypes {
    public static void main(String[] args) {

        // primitive data types
        int a=10;
        int b=a;
        a=100;
        System.out.println("a: "+a+"\nb: "+b);

        // reference data types
        custom t= new custom("Sakshi");
        custom s= t;                                                          // any changes done to either s or t will reflect in both
        System.out.println("before change tname :"+t.name);
        System.out.println("before change sname :"+s.name);

        t.name="chaitu";
        System.out.println("after change tname :"+t.name);
        System.out.println("after change sname :"+s.name);

        s.name="priya";
        System.out.println("before change tname :"+t.name);
        System.out.println("before change sname:"+s.name);


    }
}
class custom{
    String name;
    custom(String name){
        this.name = name;

    }
}
