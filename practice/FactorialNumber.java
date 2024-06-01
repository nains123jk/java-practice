//Write a Java program to find the factorial of a number.

package practice;

public class FactorialNumber {
    public static void main(String[] args) {
   int num = (5);
       System.out.println("facto"+ num +"is"+ facto(5));
    }
    public static int facto(int n){
        int res = 1, i;
        for (i = 1; i<= n; i++)
            res *= i;
        return res;
    }
}