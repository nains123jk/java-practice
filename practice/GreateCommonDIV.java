//Write a Java program to find the GCD (Greatest Common Divisor) of two numbers.


package practice;

public class GreateCommonDIV {
    public static void main(String[] args) {
        int a = 102, b = 159;
        System.out.println("Greatest Divisor" + GreatDiv(a, b));

    }

    public static int GreatDiv(int a, int b) {
      if (b == 0)
          return a;
      else
          return GreatDiv(b, a% b);
    }
}

