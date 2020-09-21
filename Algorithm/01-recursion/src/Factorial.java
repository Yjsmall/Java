/**
 * 1.Understanding the meaning of this function
 * 2.Finding the recursive end condition
 * 3.Finding function equivalence relation(focus)
 * @author smallYJ
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println("3的阶乘是" + factorial(0));
    }

    /**
     * 1.计算 n! 的阶乘
     * 修饰符,必须是static,要不然main方法方法不了
     * 静态方法不能访问非静态方法
     * @param n
     * @return final result
     */
    private static int factorial(int n){
        //2. 找见边界条件
        if (n <= 1){
            return 1;
        } else {
            //3. 等价关系式
            return n * factorial(n-1);
        }
    }
}


