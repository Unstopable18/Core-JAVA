// Create a MyClass class
public class MyClass{int x;  // Create a class attribute x

  // Create a class constructor for the MyClass class
  public MyClass(){
    x = 5;  // Set the initial value for the class attribute x to 5
  }

  public static void main(String[] args) {
    // Create an myObj object of class MyClass (This will call the constructor)
    MyClass myObj = new MyClass(); 
    // Print the value of x
    System.out.println(myObj.x);
  }
}