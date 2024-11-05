package collectionsReview.collectionsReview2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //create set
        Set<Student> studentSet = new LinkedHashSet<>();

        studentSet.add( new Student(1,"Jack"));
        studentSet.add( new Student(2,"Julia"));
        studentSet.add( new Student(3,"Mike"));
        studentSet.add( new Student(4,"Mary"));
        studentSet.add( new Student(5,"Joe"));

       // System.out.println(studentSet.add(new Student(5, "Joe")));

        System.out.print(studentSet);

         String s = "Java Developer ";
        System.out.println(" first repeating character ");
        System.out.println(firstRepeatingChar(s));


        // add element to set
    }



    public static Character firstRepeatingChar(String str){
        // time complexity of this code is  O(n)
        // create hashSet
        Set<Character> chars = new HashSet<>();// in here i have space complexity of O(n)
        // iterate over the char array and add char into hashSet
        for(Character ch: str.toCharArray())
            //if add ops is false return char
            if (!chars.add(ch)) return ch;
        return null;

            }
        }






    // output : a

