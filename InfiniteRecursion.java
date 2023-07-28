public class InfiniteRecursion {
    public static void main(String[] args) {
      int result = sum(5, 10);
      System.out.println(result);
    }
    public static int sum(int start, int end) {
        System.out.printf("Start -> %s End -> %s \n",start,end);
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
