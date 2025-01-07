package LinkList_LL.LinkListInterviewPreparation;

import LinkList_LL.CLL_CircularLinkedList.LL;

public class CLLInterviewQuestion {



    private ListNode head;
    private ListNode tail;
    private int size;

    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }



    // https://leetcode.com/problems/linked-list-cycle
    // Amazon and Microsoft
    //141.LinkedList cycle(CYCLIC SORT)
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    // https://leetcode.com/problems/linked-list-cycle-ii/
    //142.LinkedList cycle2(CYCLIC SORT)
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    //202.Happy Number

    public  boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow =finSqu(slow);
            fast = finSqu(finSqu(fast));
        }while (slow!=fast);

        if(slow==1){
            return true;
        }
        return false;

    }
    private int finSqu(int num){
        int ans = 0;
        while (num>0){

            int rem = num % 10;
            ans +=rem*rem;
            num/=10;
        }
        return ans;
    }

    /*    public static void main(String[] args) {
       System.out.println( isHappy(36));
    }*/

    //876.Middle of the linked list
    public static ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while (f!=null&&f.next!=null){
            s= s.next;
            f= f.next.next;
        }return s;
    }

    //148.Sort List

    class Solution {
        public ListNode sortList (ListNode head){
            if(head == null||head.next==null){
                return head;
            }
            ListNode mid = getMid(head);
            ListNode left = sortList(head);
            ListNode right =  sortList(mid);
            return merge(left,right);
        }
        ListNode merge(ListNode f, ListNode s) {
            ListNode DummyHead = new ListNode();
            ListNode ans =DummyHead;
            while (f != null && s != null) {
                if (f.val< s.val) {
                    ans.next=f;
                    f = f.next;
                    ans=ans.next;
                } else {
                    ans.next=s;
                    s = s.next;
                    ans=ans.next;
                }
            }
            ans.next = (f != null) ? f : s;
            return DummyHead.next;
        }
        ListNode getMid(ListNode head){
            ListNode preMid = null;
            while(head!=null && head.next!=null){
                preMid = (preMid == null)?head:preMid.next;
                head=head.next.next;

            }
            ListNode mid =preMid.next;
            preMid.next=null;
            return mid;
        }
    }



    // https://leetcode.com/problems/reverse-linked-list/submissions/
    // google, apple, amazon, microsoft
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }



    //

    // https://leetcode.com/problems/reorder-list/
// Google, Facebook
    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = middleNode(head);

        ListNode hs = reverseList(mid);
        ListNode hf = head;

        // rearrange
        while (hf != null && hs != null) {
            ListNode temp = hf.next;

            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // next of tail to null
        if (hf != null) {
            hf.next = null;
        }
    }


    public static void main(String[] args) {

        CLLInterviewQuestion list = new CLLInterviewQuestion();


        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.display();
        reorderList(list.head);

        list.display();



    }


}
class ListNode{


    int val;
    ListNode next;



    public ListNode(){

    }
    public ListNode(int x){
        val=x;
        next=null;
    }

    public ListNode(ListNode next) {
        this.next = next;
    }



}