// Abstract class
abstract class AbstractAnimal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

class AbstractPig extends AbstractAnimal{
    public void animalSound(){
        System.out.println("The Pig says -> wee wee");
    }
}
class AbstractDog extends AbstractAnimal{
    public void animalSound(){
        System.out.println("The Dog says -> bow wow");
    }
}

class Abstraction{
    public static void main(String[] args) {
        // Animal myAnimal=new Animal(); // Cannot create object of abstract class
        AbstractPig myPig=new AbstractPig();
        AbstractDog myDog=new AbstractDog();
        myPig.animalSound();
        myPig.sleep();
        myDog.animalSound();
        myDog.sleep();
    }
}

