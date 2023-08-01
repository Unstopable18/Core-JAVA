public class Threads extends Thread {
    public static int amount=0;
    public static void main(String[] args) {
        Threads thread=new Threads();
        thread.start();
        // check isalive to wait for thread to finish executing
        while(thread.isAlive()){
            System.out.println("Waiting....");
        }
        System.out.println("Amount -> "+amount);
        amount++; //update amount
        System.out.println("Amount -> "+amount);
    }
    public void run(){
        amount++;
    }
}

/*
public class Threads implements Runnable {
  public static void main(String[] args) {
    Main obj = new Main();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
*/
