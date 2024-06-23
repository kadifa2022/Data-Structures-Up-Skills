package java_core;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"HP Laptop", 25000));
        productList.add(new Product(2,"Dell Laptop", 30000));
        productList.add(new Product(3,"Lenovo Laptop", 26000));
        productList.add(new Product(4,"Sony Laptop", 28000));
        productList.add(new Product(5,"Apple Laptop", 90000));


        productList.stream().filter(product -> product.getPrice()==30000)
                .forEach(product-> System.out.println(product.getProduct()));


        Set<Float> productListPrice = productList.stream()
                .filter(product -> product.getPrice() >=30000)
                .map(product -> product.getPrice()).collect(Collectors.toSet());
        System.out.println(productListPrice);


        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");




    }






}
