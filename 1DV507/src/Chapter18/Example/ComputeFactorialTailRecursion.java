package Chapter18.Example;

public class ComputeFactorialTailRecursion {
    /** Return the factorial for a specified number */
    public static long factorial(int n) {
        return factorial(n, 1);
    }

    /** Auxiliary tail0recursive method for factorial */
    private static long factorial(int n, int result) {
        if (n == 0) {
            return result;
        }
        else
            return factorial(n - 1, n * result); // Recursive call
    }
}
