package LikedList;

public class UserListApp {
    public static void main(String[] args) {
        UserNode node1 = new UserNode("Alexander" , "Smith");
        UserLikedList myLinkedListSingle = new UserLikedList();
        myLinkedListSingle.insertLast(node1);
        myLinkedListSingle.insertLast(new UserNode("Betty", "Flinstone"));
        myLinkedListSingle.insertLast(new UserNode("Lola", "Bailey"));
        myLinkedListSingle.insertLast(new UserNode("Tina", "Terine"));
        myLinkedListSingle.printNames();

    }
}
