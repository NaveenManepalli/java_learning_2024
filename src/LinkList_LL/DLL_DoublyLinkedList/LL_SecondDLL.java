package LinkList_LL.DLL_DoublyLinkedList;

public class LL_SecondDLL {

    public static void main(String[] args) {
        LL_DoublyLinkedListClass DLlist = new LL_DoublyLinkedListClass();

        DLlist.insertFirst(3);
        DLlist.insertFirst(4);
        DLlist.insertFirst(6);
        DLlist.insertFirst(59);
        DLlist.insertFirst(6);
        DLlist.display();
        DLlist.insertLast(90);
        DLlist.display();
    }


}
