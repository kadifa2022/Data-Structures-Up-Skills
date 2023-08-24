package LikedList;

public class UserListApp {
    public static void main(String[] args) {
        UserNode node1 = new UserNode("Alexander" , "Smith");
        UserLikedList myLinkedListSingle = new UserLikedList();
        myLinkedListSingle.insertLast(node1);

    }
}
