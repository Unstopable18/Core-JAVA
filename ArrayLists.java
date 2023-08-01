import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> cars = new ArrayList<String>();
        System.out.println("ArrayList    -> "+cars);

        // Add 
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("add          -> "+cars);

        // Get from index
        System.out.println("get          -> "+cars.get(2));

        // Set with index
        cars.set(3, "Opel");
        System.out.println("set [3:Opel] -> "+cars);

        // Remove with index
        cars.remove(3);
        System.out.println("remove       -> "+cars);

        // Size of 
        System.out.println("size         -> "+cars.size());

        // For Loop
        System.out.println("For Loop     ->");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("\t        "+cars.get(i));
        }

        // For-each Loop
        System.out.println("For-each Loop->");
        for (String i : cars) {
            System.out.println("\t\t"+i);
        }

        // Sort with Collections  
        Collections.sort(cars);
        System.out.println("sort         -> "+cars);

        // Clear
        cars.clear(); 
        System.out.println("clear        -> "+cars);
    }

}
