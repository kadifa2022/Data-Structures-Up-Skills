import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_FirstRepeatingChar {
    public static void main(String[] args) {
        //create set
        Set<Student> set = new LinkedHashSet<>();
        // add elements

        set.add(new Student(1,"Jack"));
        set.add(new Student(2,"Julia"));
        set.add(new Student(3,"Mike"));
        set.add(new Student(4,"Mary"));

        String st = "Java java";

        System.out.println(firstRepeatingChar(st));
    }
    // What is the time complexity of the following code? O(n)
    public static Character firstRepeatingChar(String str){

        //Create hashSet
        Set<Character> chars = new HashSet<>();// in here I have Space Complexity of O(n)

        // iterate over the char array and add chars into hashSet
        for(Character ch: str.toCharArray()) if(!chars.add(ch)) return ch;

        // if add ops is false return that char

        return null;

    }


}
