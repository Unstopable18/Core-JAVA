public class Exceptions {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access denied - under 18 situation !!!");
        }else{
            System.out.println("Access granted...");
        }
    }
    public static void main(String[] args) {
        // checkAge(15);
        checkAge(23);
        try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        }catch(Exception e){
            System.out.println("Something went wrong !!!");

        }finally{
            System.out.println("Try catch executed...");
        }
    }
}
