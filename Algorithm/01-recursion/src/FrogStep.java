/**
 * Q:青蛙一次跳 1/2 个台阶,问跳 n 级台阶有多少种跳法?
 * @author smallYJ
 */
public class FrogStep {
    public static void main(String[] args) {
        System.out.println("3级台阶有---" + frogStep(3) + "-种跳法");
        System.out.println("10级台阶有---" + frogStep(10) + "-种跳法");
    }

    private static int frogStep(int n){
        if (n <= 2){
            return n;
        } else {
            return frogStep(n-1) + frogStep(n-2);
        }
    }
}
