package LinkList_LL.LinkListInterviewPreparation;
public class Merge_sort_list1 {
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
        ListNode Dummylist = new ListNode();
        ListNode ans =Dummylist;
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
        return Dummylist.next;
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
