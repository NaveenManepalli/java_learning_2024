//package LinkList_LL.LinkListInterviewPreparation;
//
//public class SLL_3 {
//
//    //141.LinkedList cycle(CYCLIC SORT)
//    public static boolean hasCycle(SLL.Node head){
//        SLL.Node fast = head;
//        SLL.Node slow = head;
//
//        while (fast!= null && fast.next !=null){
//            fast = fast.next.next;
//            slow =slow.next;
//            if(fast==slow){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    //length of list cycle
//
//    public static int lengthCycle(SLL.Node head){
//        SLL.Node fast = head;
//        SLL.Node slow = head;
//
//        while (fast!= null && fast.next !=null){
//            fast = fast.next.next;
//            slow =slow.next;
//            if(fast==slow){
//                //calculateLength
//                SLL.Node temp =slow;
//                int length=0;
//                do{
//                    temp= temp.next;
//                    length++;
//                }while (temp!=slow);
//                return length;
//            }
//        }
//        return 0;
//    }
//
//}
