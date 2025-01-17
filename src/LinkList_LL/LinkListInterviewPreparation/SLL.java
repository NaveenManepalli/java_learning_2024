package LinkList_LL.LinkListInterviewPreparation;

public class SLL {

    private Node head;
    private Node tail;

    private int size;

    public SLL() {
        this.size = 0;
    }

    // Single linked list node-----------------------------------START---------------------------------------------------------
    private class Node {
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

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    // inserting value in last

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

// Single linked list adding the value---------------------------------END-------------------------------------------------


//LinkedList Recursion -------------------------------------------START---------------------------------------------------

    //insert using recursion
    public void insertRec(int val, int index) {

        head = insertRec(val, index, head);

    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, --index, node.next);
        return node;
    }


//LinkedList Recursion ---------------------------------------------END---------------------------------------------------


    //getting the indexed value node -----------------------START-------------------------------------------------------------
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
//getting the indexed value node -------------------------END-------------------------------------------------------------


// Single linked list deleting the value-----------------------------START-------------------------------------------------


    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

// Single linked list deleting the value-----------------------------END-------------------------------------------------

    // finding the value------------------------------------------------START-------------------------------------------------
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return node;
    }

// finding the value--------------------------------------------------END-------------------------------------------------

    //finally displaying the whole node-------------------------------START---------------------------------------------------
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
//finally displaying the whole node-------------------------------------END----------------------------------------------


    //question--------------------------Start----------------------------------------------------------------------------------
    //Remove_Duplicate_83
    public void duplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

//    public static void main(String[] args) {
//        SLL list = new SLL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(4);
//        list.insertLast(4);
//        list.insertLast(5);
//        list.display();
//        System.out.println();
//        list.duplicates();
//        list.display();
//    }


    //21.Merge TWO sorted Linked List
    public static SLL merge(SLL First, SLL Second) {
        Node f = First.head;
        Node s = Second.head;

        SLL ans = new SLL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }

        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public static void main(String[] args) {
        SLL first = new SLL();
        SLL second = new SLL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);

        SLL ans = SLL.merge(first,second);
        ans.display();
    }

    public static boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while (fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow =slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    //length of list cycle

    public static int lengthCycle(Node head){
        Node fast = head;
        Node slow = head;

        while (fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow =slow.next;
            if(fast==slow){
                //calculateLength
                Node temp =slow;
                int length=0;
                do{
                    temp= temp.next;
                    length++;
                }while (temp!=slow);
                return length;
            }
        }
        return 0;
    }

//question--------------------------END------------------------------------------------------------------------------------
//public static void main
}

