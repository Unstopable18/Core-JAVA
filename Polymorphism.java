class Animal {
    public void animalSound() {
        System.out.println("The animal makes sounds!!");
    }    
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The Pig says -> wee wee");
    }

    public void sleep() {
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The Dog says -> bow wow");
    }

    public void sleep() {
    }
}

class Polymorphism{
    public static void main(String[] args) {
        Animal myAnimal=new Animal();
        Animal myPig=new Pig();
        Animal myDog=new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

