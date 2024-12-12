//package LinkList_LL.LinkListInterviewPreparation;
//
//public class SLL_2 {
//
//    public static SLL merge(SLL First, SLL Second) {
//        SLL.Node f = First.head;
//        SLL.Node s = Second.head;
//
//        SLL ans = new SLL();
//
//        while (f != null && s != null) {
//            if (f.value < s.value) {
//                ans.insertLast(f.value);
//                f = f.next;
//            } else {
//                ans.insertLast(s.value);
//                s = s.next;
//            }
//
//        }
//
//        while (f != null) {
//            ans.insertLast(f.value);
//            f = f.next;
//        }
//        while (s != null) {
//            ans.insertLast(s.value);
//            s = s.next;
//        }
//
//        return ans;
//    }
//
//}
