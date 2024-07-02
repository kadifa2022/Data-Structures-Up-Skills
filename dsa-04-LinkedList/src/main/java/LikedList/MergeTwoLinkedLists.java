package LikedList;

public class MergeTwoLinkedLists {

    public static void main(String[] args) {


    }

    public  ListNode mergeLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1 != null && l2 !=null){
            //merge list
           if(l1.value <= l2.value){
               curr.next = l1;
               l1 = l1.next;
           }
           else{
               curr.next = l2;
               l2 = l2.next;
           }
           curr = curr.next;
        }
        curr.next = l1!=null ? l1:l2;
        return dummy.next;

    }

}
