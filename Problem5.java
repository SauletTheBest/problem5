import java.util.Scanner;

/**
 * This class contains a method to calculate the nth Fibonacci number using recursion.
 * It takes user input for the value of 'n' and outputs the nth Fibonacci number.
 */
public class Problem5 {

    /**
     * Main method to read user input, call the fibonacci method, and output the result.
     * Time Complexity: O(2^n)
     * - The method calls itself recursively twice for each value of 'n'.
     * - The worst-case time complexity occurs when 'n' is large, leading to exponential time complexity.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(fibonacci(number));
    }

    /**
     * Method to calculate the nth Fibonacci number using recursion.
     * Time Complexity: O(2^n)
     * - The method calls itself recursively twice for each value of 'n'.
     * - The worst-case time complexity occurs when 'n' is large, leading to exponential time complexity.
     *
     * @param n The index of the Fibonacci number to be calculated.
     * @return The nth Fibonacci number.
     */
    public static long fibonacci(int n){
        if (n <= 1){
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
