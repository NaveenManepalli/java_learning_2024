package LinkList_LL.CLL_CircularLinkedList;

public class LL_CircularLinkedListClass {
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    private Node head;
    private Node tail;
    private int size;

    public LL_CircularLinkedListClass() {
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next =head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size+=1;
    }

    public void insertlast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail=node;
        size++;

        if(tail==null){
            insertFirst(val);
            return;
        }
    }

    public void insert (int val){
        Node node = new Node(val);
        if(head==null){
            head =node;
            tail =node;
            return;
        }
        tail.next= node;
        node.next=head;
        tail=node;
    }

    public Node insertRec(int val, int index, Node node){
        if (index ==0 ){
            Node temp = new Node(val ,node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1,node.next);
        return node;
    }

    public Node get(int index){
        Node node = head;
        for (int i =0;i<index;i++){
            node =node.next;
        }
        return node;
    }


    public void delete (int val){
        Node node = head;
        if( node == null){
            return;
        }
        if(node.val== val){
            head=head.next ;
            tail.next =head;
            return;
        }
        do{
            Node n =  node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node !=head);
    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val+"->");
                node =node.next;
            }while (node!=head);
        }
        System.out.println("HEAD");
    }
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.val > second.val) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }


}