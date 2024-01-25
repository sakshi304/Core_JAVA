package CORE;


class Out
{
    int x=10;
    static int y=20;


        public void show()
        {
            class in {
                void display(){
                    System.out.println("HELLO");
                }
            }
            in obj= new in();
            obj.display();
        }
  //      in n = new in();             you cannot create object outside the method


}

public class INNER_Localclass
{
    public static void main(String[] args)
    {
        Out m=new Out();
        m.show();
//        Out.in t= new Out().new in();    local inner class itna chipa pada hai ki outer class ko bhi nhi pata ki uske ander ek aur class hai!!!

    }

}