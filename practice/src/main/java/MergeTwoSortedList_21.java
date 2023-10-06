

public class MergeTwoSortedList_21 {

    public static void main(String[] args) {




        // mergeTwoLists(list1, list2)

    }

    public  ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        // base case

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        // finding out the head of the new formed list
        ListNode1 head;

        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2= list2.next;
        }
        head.next = mergeTwoLists(list1, list2); // recursive stop
        return head;


    }




}
