package CORE;

abstract class sakshi{
    sakshi(){
        System.out.println("hello i am constructor");
    }
    abstract void display();
     void I_am_emptyBODY_Method(){};
 //    abstract void I_am_abstract_method();
}
class chaitu{                                              // chaitu is an anonymous class
    public void show(){
        sakshi s= new sakshi(){                        // anonymous class must define every method of abstract class
            void display(){                            // constructor of abstract class also gets called
                System.out.println("hello");
            }

        };
    s.display();
    }
    sakshi t=new sakshi() {
        @Override
        void display() {
            System.out.println("GAJODHAR");
        }
    };
}

public class INNER_Anonymousclass {
    public static void main(String[] args) {
        chaitu c= new chaitu();
        c.show();
        sakshi g= c.t; // its like giving reference of t to g
        g.display();
    }

}
