package linkedListReview;

public class MySinglyLikedListApp {
    public static void main(String[] args) {

        MySinglyList mySinglyList = new MySinglyList();
        System.out.println(mySinglyList.isEmpty());

        for(int i = 0; i < 10; i++){
            mySinglyList.add(i);
        }
       mySinglyList.printNodes();
       mySinglyList.deleteById(1);
       mySinglyList.printNodes();


    }
}
