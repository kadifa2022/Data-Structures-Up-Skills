package Arrays;

public class HashCodeExample {
    public static void main(String[] args) {
//        String a = "abc";
//        String b = "abcd";
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

        Car car1 = new Car("BMW", 1);
        Car car2 = new Car("Audi", 2);

        System.out.println("Car1 object nextCar value after construction = " + car1.nextCar);

        System.out.println("Car1 name hashCode " + car1.name.hashCode()); // same HashCode because of the name (BMW) Stored in string pool
        System.out.println("Car2 name hashCode " + car2.name.hashCode());

        System.out.println("Car1 object hashCode " + car1.hashCode());// different objects/hashCode
        System.out.println("Car2 object hashCode " + car2.hashCode());

        System.out.println(car1.equals(car2));// hash code is not the same and not the same objects
        System.out.println(car1 == car2);

        System.out.println(car1.nextCar);
        car1.nextCar = car2;
        System.out.println("Car name is : " + car1.name + " Car2 name is : " + car1.nextCar.name );

    }
}
