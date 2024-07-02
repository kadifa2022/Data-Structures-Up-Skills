package review;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();

    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();

        for(Apple apple: inventory){
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}

