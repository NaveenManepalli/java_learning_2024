package LinkList_LL.CLL_CircularLinkedList;

public class LL_ThirdCLL {
    public static void main(String[]args){
        LL_CircularLinkedListClass Cll = new LL_CircularLinkedListClass();
        Cll.insert(55);
        Cll.insert(5);
        Cll.insert(54);
        Cll.insert(4);
        Cll.display();
        Cll.delete(5);
        Cll.display();
    }
}
