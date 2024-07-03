package implementationOfLinkedList;

public class UserListApp {
    public static void main(String[] args) {

        UserLinkedList list = new UserLinkedList();
        list.insertLast(new UserNode("Carol", "Smith"));
        list.insertLast(new UserNode("Jack", "Reacher"));
        list.insertLast(new UserNode("Tina", "Blay"));
        list.printNames();
       list.deleteByName("Tina");
        list.printNames();


    }
}
