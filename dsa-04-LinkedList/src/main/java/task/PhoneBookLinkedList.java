package task;

import java.util.ArrayList;
import java.util.List;
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
                return current;//return the node if the first name matches
            }
            current = current.next;
        }
        // if no match is found after traversing the list, throw an exception
        throw new NoSuchElementException("Name doesn't exist");

    }
    public List<PhoneNode> findAllByLastName(String lastName){
        List<PhoneNode> listLastName= new ArrayList<>();

        if(isEmpty()){ // returning an empty list if the list is empty
           return listLastName;
        }
        PhoneNode current = head;
        while(current != null){
            if(current.contact.getLastName().equals(lastName)){
                listLastName.add(current);// add matching node to the list
            }
            current = current.next;// return the list, which may be empty or filled with matching nodes
        }
        return listLastName;
    }


    public void deleteByFirstName(String firstName) {
        if (isEmpty()) throw new NoSuchElementException(" Name does not exist");

        PhoneNode prev = head;
        PhoneNode current = head;
        while (current != null) {
            if (current.contact.getFirstName().equals(firstName)) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;

                    size--;
                }
            }
            prev = current;
            current.next = null;
        }
    }

    public void deleteAllMatchingLastName(String lastName){
        if(isEmpty()){
            throw new NoSuchElementException("No such element");
        }
        // handle the case where head itself contains a matching last name
        while(head!= null && head.contact.getLastName().equals(lastName)){
            head = head.next;
        }
        PhoneNode current = head;
        //Traverse through the list and remove matching nodes
        while (current != null & current.next != null){
            if(current.contact.getLastName().equals(lastName)){
                //skip the next node if it matches
                current.next =current.next.next;
            }else {
                current = current.next; // move to the next node
            }
        }
    }

    public List<PhoneNode> findAll(){
        List<PhoneNode> phoneNodes = new ArrayList<>();
        return phoneNodes;
    }















}
