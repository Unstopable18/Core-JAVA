import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {

        // HashSet
        HashSet<String> cars = new HashSet<String>();
        System.out.println("HashSet       -> "+cars);

        // Add 
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println("add           -> "+cars);

        // check contains with value
        System.out.println("contains:Ford -> "+cars.contains("Ford"));

        // Remove with index
        cars.remove("Volvo");
        System.out.println("remove: Volvo -> "+cars);

        // Size of 
        System.out.println("size          -> "+cars.size());

        // For-each Loop
        System.out.println("For-each Loop ->");
        for (String i : cars) {
            System.out.println("\t\t "+i);
        }

        // Clear
        cars.clear(); 
        System.out.println("clear         -> "+cars);
    }

}
