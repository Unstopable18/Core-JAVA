
// class with final cannot be inheritated
// final class InheritanceVehical { }
 
class InheritanceVehical {
    // attribute
    protected String brand ="Ford";
    // method
    public void honk(){
        System.out.println("Tuu, tuut !!!");
    }    
}

class Car extends InheritanceVehical{
    // car attribute
    private String modelName="Mustang";
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.honk();
        System.out.println(myCar.brand+" "+myCar.modelName);
    }
}
