// Create a Main class
public class ConstructorMain {
    int x;  // Create a class attribute
    int modelYear;
    String modelName;
    // Create a class constructor for the Main class
    public ConstructorMain(int year, String name) {
      x = 5;  // ** To Set the initial value for the class attribute x **
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      // Create an object of class Main (This will call the constructor)
      ConstructorMain myObj = new ConstructorMain(1969, "Mustang");
      System.out.println(myObj.x); // Print the value of x
      System.out.println(myObj.modelYear + " " + myObj.modelName); 
    }
}
