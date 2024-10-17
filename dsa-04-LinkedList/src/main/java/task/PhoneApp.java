package task;

public class PhoneApp {

    public static void main(String[] args) {
        System.out.println("This is our linked list task as group 3");
    PhoneBookLinkedList phoneBook = new PhoneBookLinkedList();
    Contact contact1 = new Contact("Kevin", "Lee","kLee@gmail.com", "12453773");
    Contact contact2 = new Contact("Mike", "Black","Mblack@gmail.com", "9124537388");
    Contact contact3 = new Contact("Shanon", "White","Swhite@gmail.com", "9245375214");
    Contact contact4 = new Contact("Tom", "Winter","TWinter@gmail.com", "288537192");
    Contact contact5 = new Contact("Ray",  "Lee","Rsommer@gmail.com", "48853773");
    phoneBook.add(contact1);
    phoneBook.add(contact2);
    phoneBook.add(contact3);
    phoneBook.add(contact4);
    phoneBook.add(contact5);

    phoneBook.findAllByLastName("Lee");
    phoneBook.printPhoneBook();
    //phoneBook.deleteAllMatchingLastName("Lee");
    phoneBook.printPhoneBook();
    phoneBook.findAll();
    phoneBook.printPhoneBook();
        }
    }

