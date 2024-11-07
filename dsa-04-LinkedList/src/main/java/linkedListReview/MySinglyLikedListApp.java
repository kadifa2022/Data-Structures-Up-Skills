package linkedListReview;

public class MySinglyLikedListApp {
    public static void main(String[] args) {

        MySinglyList mySinglyList = new MySinglyList();
        System.out.println(mySinglyList.isEmpty());

        for(int i = 0; i < 10; i++){
            mySinglyList.addToLast(i);
        }
       mySinglyList.printNodes();
        System.out.println("kth item from the last :" + mySinglyList.getKthFromLast(3));
        mySinglyList.removeKthFromLast(3);
        mySinglyList.printNodes();
//       mySinglyList.deleteById(9);
//       mySinglyList.printNodes();
//        System.out.println("index of 3: " + mySinglyList.indexOf(3));
 //     mySinglyList.addFirst(12);



    }
}
