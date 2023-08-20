public class HashCodeExample {


    public static void main(String[] args) {
//        String a= "abc";
//        String b= "abc";
//
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

//        Car car1 = new Car("BMW", 1);// two different objects, we override equals()
//        Car car2 = new Car("BMW", 1);
//        System.out.println(car1.hashCode());
//        System.out.println(car2.hashCode());
//
//        System.out.println(car1.equals(car2));// not same objects
//        System.out.println(car1 ==car2);

        Car car1 = new Car("BMW", 1);
        Car car2 = new Car("BMW", 2);

        System.out.println("Car1 object nextCar value after construction= " + car1.nextCar);

        System.out.println(car1.nextCar);

        car1.nextCar=car2;
        System.out.println("Car1 next car value" + car1.nextCar);
        System.out.println("Address of nextCar of car1:" + car1.nextCar);
        System.out.println("Car name is: " + car1.name + " Car2 name is:" + car1.nextCar.name);

    }
}
