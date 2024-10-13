package Review_LikedList;



public class UserListApp {
    public static void main(String[] args) {
        UserNode node1 = new UserNode("Mike", "Smith");
        UserLinkedList myLinkedListSingle = new UserLinkedList();
        myLinkedListSingle.insertLast(node1);
        myLinkedListSingle.insertLast(new UserNode("Sara" , " White"));
        myLinkedListSingle.insertLast(new UserNode("Tina" , " Drop"));
        myLinkedListSingle.insertLast(new UserNode("Joe" , " UUUEnd"));
        myLinkedListSingle.printNames();
        myLinkedListSingle.insertFirst(new UserNode("SubZero", "test"));
        myLinkedListSingle.printNames();
        myLinkedListSingle.deleteByName("Joe" );
        System.out.println("Size : "+ myLinkedListSingle.size );
        myLinkedListSingle.printNames();


    }
}

