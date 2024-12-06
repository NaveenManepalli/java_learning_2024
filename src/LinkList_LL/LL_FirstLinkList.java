package LinkList_LL;

public class LL_FirstLinkList {
    public static void main(String[] args) {
        LL_SingleLinkedListClass list = new LL_SingleLinkedListClass();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(59);
        list.insertLast(89);
        list.insert(541,2);
        list.display();
        System.out.println();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println();
        System.out.println(list.delete(2));
        list.display();
    }


}
