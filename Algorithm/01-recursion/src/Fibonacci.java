/**
 * @author smallYJ
 */
public class Fibonacci {
    public static void main(String[] args) {
        int result = fibonacci(3);
        System.out.println(result);
    }

    private static int fibonacci(int n){
        if (n <= 2){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
