/*
 * This program calculates the n-th Fibonacci number using recursion.
 * It prompts the user to input a number n, then calls the fibonacci(n) function,
 * which recursively computes the Fibonacci number.
 *
 * The fibonacci(n) function works as follows:
 * - If n is 0 or 1, it returns n (base cases).
 * - Otherwise, it returns the sum of the previous two Fibonacci numbers, fibonacci(n-1) + fibonacci(n-2).
 *
 * Example:
 * If the user inputs 5, the program will output the 5th Fibonacci number, which is 5.
 */
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(fibonacci(number));

    }
    public static long fibonacci(int n){

        if (n <= 1){
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
