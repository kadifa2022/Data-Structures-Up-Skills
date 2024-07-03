package likedList;

public class UserListApp {
    public static void main(String[] args) {
        UserNode node1 = new UserNode("Alexander" , "Smith");
        UserLikedList myLinkedListSingle = new UserLikedList();
        myLinkedListSingle.insertLast(node1);
        myLinkedListSingle.insertLast(new UserNode("Betty", "Flinstone"));
        myLinkedListSingle.insertLast(new UserNode("Lola", "Bailey"));
        myLinkedListSingle.insertLast(new UserNode("Tina", "Terine"));
        myLinkedListSingle.printNames();
        myLinkedListSingle.insertFirst(new UserNode("Subzero", "test"));
        myLinkedListSingle.printNames();
        myLinkedListSingle.deleteByName("Subzero");
        System.out.println(" Size : " + myLinkedListSingle.size);
        myLinkedListSingle.printNames();



    }
}
