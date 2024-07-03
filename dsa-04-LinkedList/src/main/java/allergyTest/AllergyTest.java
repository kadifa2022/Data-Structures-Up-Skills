package allergyTest;

import java.util.ArrayList;
import java.util.List;

public class AllergyTest {
    public static void main(String[] args) {
        List<String> foods = List.of("milk","eggs","peanuts", "shellfish", "strawberries", "tomatoes", "chocolate");
    List<String> allergies = findAllergies(foods);
        System.out.println("Patient is Allergic to: " + allergies);
    }

    public static boolean isAllergic(List<String> foods) {
        List<String> allergies = List.of("peanuts", "shellfish");
        for (String food : foods) {
            if (allergies.contains(food)) {
                return true;
            }
        }
        return false;
    }

    // Method to find exact allergies using binary search approach
    public static List<String> findAllergies(List<String> foods) {
        List<String> result = new ArrayList<>();
        findAllergiesHelper(foods, result);
        return result;
    }

    private static void findAllergiesHelper(List<String> foods, List<String> result) {
        if (foods.isEmpty()) {
            return;
        }
        if (foods.size() == 1) {
            if (isAllergic(foods)) {
                result.add(foods.get(0));
            }
            return;
        }
        int mid = foods.size() / 2;
        List<String> left = foods.subList(0, mid);
        List<String> right = foods.subList(mid, foods.size());

        if(isAllergic(left)){
            findAllergiesHelper(left, result);
        }
        if(isAllergic(right)){
            findAllergiesHelper(right, result);
        }

    }
}