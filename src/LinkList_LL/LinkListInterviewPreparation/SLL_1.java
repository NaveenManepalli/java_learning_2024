//package LinkList_LL.LinkListInterviewPreparation;
//
//public class SLL_1 {
//    public ListNode deleteDuplicates(ListNode node) {
//
//        if(node==null){
//            return node;
//        }
//        ListNode head= node;
//        while (node.next!=null){
//            if(node.value == node.next.value){
//                node.next =node.next.next;
//                size--;
//            }else{
//                node =node.next;
//            }
//        }
//        return head;
//
//
//    }
//}
