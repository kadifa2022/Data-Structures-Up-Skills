import com.sun.tools.javac.Main;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesFromSortedList_83 {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        System.out.println(removeDuplicates((ListNode) list));


    }

    public static ListNode removeDuplicates(ListNode head){
        ListNode current = head; //assigning to the head
        while(current != null && current.next !=null){// checking if the first and next node exist
            if(current.next.val == current.val){// checking first and next node if they are same value
                current.next = current.next.next;// if they are the same value go to the next.next node
            }else{
                current= current.next;// otherwise go to next node
            }
        }
        return head; //return the head

    }
}
