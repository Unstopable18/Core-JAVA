// abstract class
abstract class AbstractClass {
    public String fname ="John";
    public int age =24;
    public abstract void study(); //abstract method
}

// Subclass to inherit the abstract class
class Student extends AbstractClass{
    public int gradYear=2022;
    public void study(){ 
        // body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
