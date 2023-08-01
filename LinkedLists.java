
import java.util.LinkedList;
import java.util.Collections;
public class LinkedLists {
    public static void main(String[] args) {

        // LinkedList
        LinkedList<String> cars = new LinkedList<String>();
        System.out.println("LinkedList   -> "+cars);

        // Add 
        cars.add("Volvo");
        cars.add("BMW");
        System.out.println("add          -> "+cars);

        // Add First
        cars.addFirst("Mazda");
        System.out.println("addFirst     -> "+cars);

        // Add Last
        cars.addLast("Ford");
        System.out.println("addLast      -> "+cars);

        // Get from index
        System.out.println("get          -> "+cars.get(2));

        // GetFirst from index
        System.out.println("getFirst     -> "+cars.getFirst());

        // GetLast from index
        System.out.println("getLast      -> "+cars.getLast());

        // Set with index
        cars.set(3, "Opel");
        System.out.println("set [3:Opel] -> "+cars);
        
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
        
        // Remove with index
        cars.remove(3);
        System.out.println("remove       -> "+cars);

        // Remove with index
        cars.removeFirst();
        System.out.println("removeFirst  -> "+cars);

        // Remove with index
        cars.removeLast();
        System.out.println("removeLast   -> "+cars);

        // Clear
        cars.clear(); 
        System.out.println("clear        -> "+cars);
    }

}

