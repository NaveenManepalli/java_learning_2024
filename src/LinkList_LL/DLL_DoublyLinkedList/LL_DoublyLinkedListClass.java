package LinkList_LL.DLL_DoublyLinkedList;


public class LL_DoublyLinkedListClass {
    private Node head;
    private Node tail;

     int size;

    public LL_DoublyLinkedListClass(){
        this.size =0;
    }
// Doubly linked list adding value-----------------------------------START---------------------------------------------------------

//inserting first

    public void insertFirst1(int val){
        Node node =new Node(val);
        node.next =head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }


        if(tail == null){
            tail = head;
        }

        size += 1;

        head = node;
    }

    public void insertLast2(int val){

        if(tail == null){
            insertFirst1(val);
            return;
        }
        Node node = new Node(val);


        node.next =null;

        if(head==null){
            node.prev =null;
            head = node;
            return;
        }

        while (tail.next != null){
            tail=tail.next ;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
        return;

    }


    public void insertFirst(int val){
        Node node =new Node(val);
        node.next =head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }
        head = node;
    }


    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next =null;

        if(head==null){
            node.prev =null;
            head = node;
            return;
        }

        while (last.next != null){
            last =last.next;
        }

        last.next = node;
        node.prev = last;
        tail = node;
    }






    public void display(){
        Node neu = head;
        Node last =null;
        while (neu!=null){
            System.out.print(neu.value +" -> " );
            last =neu;
            neu = neu.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null){
            System.out.print(last.value + "->");
            last=last.prev;
        }
        System.out.println("START");
    }

    private class Node{
         int value;
         Node next;
         Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev =prev;
        }
    }


}
