package Collections_framework;
import java.util.*;
public class Arraylist_iterator {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(2,50,1));
        al1.add(10);
        al1.add(1);
        al1.add(2);
        System.out.println(al1);
        al1.add(1,25);
        System.out.println(al1);
        al1.addAll(2,al2);
        System.out.println(al1);
        al1.remove(2);
        System.out.println(al1);

        System.out.println("1st index encountered: "+al1.indexOf(1));
        System.out.println("Returns last index: "+al1.lastIndexOf(1));

        al1.set(5,70);
        System.out.println(al1);

        System.out.println("USing for loop");
        for(int i=0;i<al1.size();i++){
            System.out.print(al1.get(i)+" ");
        }
        System.out.println("\nUsing for-each");
        for(Integer x:al1){
            System.out.print(x+" ");
        }

        System.out.println("\nUsing Iterator (while loop): ");
        Iterator<Integer> it = al1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("\nUSing Iterator (for loop): ");
        for(Iterator<Integer>it2=al1.iterator();it2.hasNext();){
            System.out.print(it2.next()+" ");
        }



    }
}
