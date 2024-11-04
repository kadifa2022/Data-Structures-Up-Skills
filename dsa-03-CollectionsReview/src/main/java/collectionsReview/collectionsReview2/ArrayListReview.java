package collectionsReview.collectionsReview2;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // create ArrayList and a class
        List<Student> students = new ArrayList<>();

        //add element to ArrayList
        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));

        // Iteration on ArrayLists
        //1.For loop with get(index)
        System.out.println("Printing with legacy for-loop--------------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        //2. Creating and printing with Iterator
        System.out.println("Creating and printing Forward (hasNext()with Iterator------------");
        Iterator iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("Printing with Iterator Backward ------------ ");
        // Backward Iteration
        // it is looking for list qualifier which one implementation do you want to use
        while(((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }

        //3. for each loop
        System.out.println("Printing with for each loop----------------");
        for (Student student : students) {// name of the arrayList
            System.out.println(student);

        }
        // 4. lambda
        System.out.println("Printing with the lambda and for each loop");
        students.forEach(student -> System.out.println(student));

        // 5. Sorting elements in list with comparator
        // create own class
        System.out.println("Sorting elements in List using comparator interface byIdDesc---------");
        Collections.sort(students, new sortByIdDesc());
      students.forEach(student -> System.out.println(student));

      System.out.println("Sorting by name----------");
      Collections.sort(students, new sortByNameDesc());
      students.forEach(student -> System.out.println(student));
    }
        // implementation for Comparator and override method
    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }
    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int  compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}