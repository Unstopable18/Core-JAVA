public class Datatypes {
    public static void main(String[] args){
        /*  Primitive data types - byte, short, int, long, float, double, boolean and char
        Non-primitive data types - String, Arrays and Classes */
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println("Hey "+fullName);
        final int myNum = 5; // final for constant
        // myNum=10; 
        float myFloatNum = 5.99f;
        char myLetter = 'V';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println(myNum+"--"+myFloatNum+"--"+myLetter+"--"+myBool+"--"+myText);
        byte myByte=100;
        short myShort=5000;
        int myInt=100000;
        long myLong=15000000000L;
        double myDouble=19.99d;
        System.out.println(myByte+"--"+myShort+"--"+myInt+"--"+myLong+"--"+myDouble);
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1+" "+myVar2+" "+myVar3);
    }
}
