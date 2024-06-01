//Write a Java program to print the Fibonacci series up to a given number.


package practice;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10;
        fibbo(num);
    }

    public static int fibbo(int num) {
        int a1 = 0, a2 = 1;
        for (int i = 1; i <= num; ++i) {
            System.out.println(a1 + " ");
            int a3 = a2 + a1;
            a1 = a2;
            a2 = a3;

        }
        return a1;
    }
}
