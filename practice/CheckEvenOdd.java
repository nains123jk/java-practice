//Write a Java program to check if a number is even or odd.


package practice;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int num  = (68);
        if(EvenOdd(num)){
            System.out.println("This is Even Number");
        }else {
            System.out.println("This Is Odd Number");
        }
    }
    public static boolean EvenOdd(int num){
        if (num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}

