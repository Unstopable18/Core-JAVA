public class wrappers {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        // Values can be parsed as other datatypes
        System.out.println(myInt.doubleValue()); // Int as Double
        System.out.println(myDouble.intValue()); // Double as Int
        System.out.println(myChar.charValue()); // Char as Char
        String myString = myInt.toString(); // Int to String
        System.out.println(myString.length());
    }
}
