package LinkList_LL.LinkListInterviewPreparation;

public class CLLInterviewQuestion {



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
    public ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while (f!=null&&f.next!=null){
            s= s.next;
            f= f.next.next;
        }return s;
    }

    //148.Sort List


}
class ListNode{
    int val;
    ListNode next;

    public ListNode(){

    }
    ListNode(int x){
        val=x;
        next=null;
    }
}