//Write a Java program to check if a number is a prime number.


package practice;

public class CheckPrimeNUmber {
    public static void main(String[] args) {
        if (Checked(20)){
          System.out.println("The Number Is Prime");
      }else {
          System.out.println("The number is Not Prime");
      }
    }
    public static boolean Checked(int num){
        if (num <= 1)
            return false;
        for (int i = 2; i<= num /2 ; i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}
