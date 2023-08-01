import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        // Collection: ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        System.out.println("ArrayList    -> "+numbers);

        // Iterator
        Iterator<Integer> it = numbers.iterator();

        // First item of Collection
        System.out.println("Iterator First Item -> "+it.next());

        // while loop-> For and for-each loop does'nt work here
        while(it.hasNext()){
            // System.out.println(it.next());
            Integer i=it.next();
            if(i<10){
                it.remove();
            }
        }
        System.out.println("ArrayListUpdated  -> "+numbers);
    }
}
