// Iterating is a term used to loop elements 
// iterators are used to loop items

import java.util.Iterator;
import java.util.ArrayList;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Volks");
        //making iterator for Arraylist
        Iterator<String> it = cars.iterator();
        //iterating through the list using iterator
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
