// Interface class
interface InterfaceAnimalSound {
    // Interface method (does not have a body)
    public void animalSound();
}
interface InterfaceAnimalSleep {
    // Interface method (does not have a body)
    public void sleep();
}

class InterfacePig implements InterfaceAnimalSound,InterfaceAnimalSleep{
    public void animalSound(){
        System.out.println("The Pig says -> wee wee");
    }
    public void sleep() {
        System.out.println("Zzz...");
    }
}
class InterfaceDog implements InterfaceAnimalSound,InterfaceAnimalSleep{
    public void animalSound(){
        System.out.println("The Dog says -> bow wow");
    }
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class InterfaceImplements {
    public static void main(String[] args) {
        // Animal myAnimal=new Animal(); // Cannot create object of Interface class
        InterfacePig myPig=new InterfacePig();
        InterfaceDog myDog=new InterfaceDog();
        myPig.animalSound();
        myPig.sleep();
        myDog.animalSound();
        myDog.sleep();
    }
}

