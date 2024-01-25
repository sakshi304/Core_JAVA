package DSA;


class LL{
    private Node head,tail;
    private int size=0;
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int val){
        if(size==0){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size-1){
            insertLast(val);
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node= new Node(val,temp.next);
        temp.next=node;
    }

    public void deleteFirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }

    }
    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node secondlast=get(size-2);

        tail=secondlast;
        tail.next=null;
        size--;
        return tail.val;
    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteFirst();
            return;
        }
        Node prev=get(index-1);
        prev.next=prev.next.next;

    }
    public Node get(int index){          //returns address of the index mentioned
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }


    private class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }

    }

}
public class Linked_list {
    public static void main(String[] args) {
        LL list= new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(100);
       list.insert(101,2);
        list.display();
        list.deleteFirst();
        list.display();
        System.out.println(list.deleteLast());
        list.display();

        list.delete(2);
        list.display();


    }
}
