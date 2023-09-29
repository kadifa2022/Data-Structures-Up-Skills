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
        ListNode current = head;
        while(current != null && current.next !=null){
            if(current.next.val == current.val){
                current.next = current.next.next;
            }else{
                current= current.next;
            }
        }
        return head;

    }
}
