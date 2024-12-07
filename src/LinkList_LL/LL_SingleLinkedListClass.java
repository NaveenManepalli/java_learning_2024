package LinkList_LL;

public class LL_SingleLinkedListClass {

    private Node head;
    private Node tail;

    private int size;

    public LL_SingleLinkedListClass() {
        this.size=0;
    }

// Single linked list node-----------------------------------START---------------------------------------------------------
    private class Node{
        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

// Single linked list node---------------------------------------------END-------------------------------------------------


//Single linked list adding value__________________________START___________________________________________________________
    //inserting value in first

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next =head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    // inserting value in last

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

// Single linked list adding the value---------------------------------END-------------------------------------------------

//getting the indexed value node -----------------------START-------------------------------------------------------------
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node =node.next;
        }
        return node;
    }
//getting the indexed value node -------------------------END-------------------------------------------------------------

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

// Single linked list deleting the value-----------------------------START-------------------------------------------------

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next =null;
        return val;
    }

    public int delete(int index){
        if (index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

// Single linked list deleting the value-----------------------------END-------------------------------------------------

// finding the value------------------------------------------------START-------------------------------------------------
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }

// finding the value--------------------------------------------------END-------------------------------------------------

//finally displaying the whole node-------------------------------START---------------------------------------------------
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value +" --> ");
            temp=temp.next;
        }
        System.out.print("END");
    }
//finally displaying the whole node-------------------------------------END----------------------------------------------



}
