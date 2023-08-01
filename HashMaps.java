import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        // HashMap
        HashMap<String,Integer> cars = new HashMap<String,Integer>();
        System.out.println("HashMap      -> "+cars);

        // put 
        cars.put("Volvo",50);
        cars.put("BMW",35);
        cars.put("Ford",40);
        cars.put("Mazda",48);
        System.out.println("put          -> "+cars);

        // Get from key
        System.out.println("get          -> "+cars.get("Ford"));

        // Remove with key
        cars.remove("Ford");
        System.out.println("remove       -> "+cars);

        // Size of 
        System.out.println("size         -> "+cars.size());

        // For-each Loop Keyset
        System.out.println("For-each Loop->");
        for (String i : cars.keySet()) {
            System.out.println("\t\t"+i);
        }

        // For-each Loop Values
        System.out.println("For-each Loop->");
        for (Integer i : cars.values()) {
            System.out.println("\t\t"+i);
        }

        // For-each Loop Keyset Values
        System.out.println("For-each Loop->");
        for (String i : cars.keySet()) {
            System.out.println("\t\tKey: "+i+" Value: "+cars.get(i));
        }

        // Clear
        cars.clear(); 
        System.out.println("clear        -> "+cars);
    }

}

