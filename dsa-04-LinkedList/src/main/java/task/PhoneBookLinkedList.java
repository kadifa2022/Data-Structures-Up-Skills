package task;

import java.util.NoSuchElementException;

public class PhoneBookLinkedList {
    public PhoneNode head;
    public PhoneNode tail;
    public int size;

    public boolean isEmpty() {return  head == null;
    }
    public int size(){return  size;}

    public void printPhoneBook(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        PhoneNode current = head;
        System.out.println();
        while (current != null){
            System.out.println(current.contact + " => ");
            current = current.next;
            if(current == null) System.out.println("null");
        }
    }
    public void add(Contact contact){
        PhoneNode nodeToBeInserted = new PhoneNode(contact);

        if(isEmpty()){
            head = tail = nodeToBeInserted;
        }else{
            tail.next = nodeToBeInserted;
            tail = nodeToBeInserted;
        }
        size++;

    }
    public PhoneNode findByFirstName(String firstName){
        if(isEmpty()){
            throw new NoSuchElementException("Name does not exist");
        }
        PhoneNode current = head;
        while (current != null){
            if(current.contact.getFirstName().equals(firstName)){
                return current;
            }
            current = current.next;
        }
        throw new NoSuchElementException(" doesn't exist");

    }














}
