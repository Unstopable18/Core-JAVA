public class Enums {
    // enums are constants cannot create object but can be used as interface
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM; 
        System.out.println(myVar);
        for (Level myIter : Level.values()) {
            System.out.println(myIter);
        }
    }
}
