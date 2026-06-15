//3 ways to store data in java --> ArrayList(array to store any type of data), HashSet(only stores unique elements), HashMap(stores in key value pair)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class StructureTyoes{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        HashSet<String> fruits = new HashSet<String>();
        HashMap<String, String> countries = new HashMap<String,String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Volks");
        System.out.println(cars);
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // willl not be added as hashset contains unique elements
        fruits.add("orange");
        System.out.println(fruits);
        countries.put("India","Delhi");   //put used to add elements in hashmaps
        countries.put("canada","ontario");
        countries.put("USA","Washington");
        System.out.println(countries);

    }
}