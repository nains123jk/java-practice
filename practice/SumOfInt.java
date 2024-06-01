//Write a Java program that takes two integers from the user and prints their sum.

package practice;

public class SumOfInt {
    public static void main(String[] args) {
        int i =IntSum(10,50);
        System.out.println(i);
    }
    public static int IntSum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
