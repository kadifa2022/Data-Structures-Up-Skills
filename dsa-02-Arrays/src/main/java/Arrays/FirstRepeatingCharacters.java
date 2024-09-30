package Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstRepeatingCharacters {
    public static void main(String[] args) {
        Set<Student>  set = new LinkedHashSet<>();
        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Mike"));
        set.add(new Student(3, "Sara"));
        set.add(new Student(4, "Hana"));
        set.add(new Student(5, "Joe"));

    }
    public static Character firstRepeatingCharacter(String str){
        Set<Character> chars = new HashSet<>();
        for(Character ch: str.toCharArray()){
            if(!chars.add(ch)) return ch;
        }
        return null;



    }

}
