package DSA;
class dll{
    private Node head;
    private Node tail;
    private class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
        }
        Node(int val, Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
    public void insertFirst(int val){
            Node node= new Node(val);
            node.next=head;
            node.prev=null;
            if(head!=null){
                head.prev=node;
            }
            head=node;

    }

    public void insertLast(int val){
        Node node=new Node(val);

        node.prev=tail;

    }


}
public class Linked_list_double {

}
