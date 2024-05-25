package practice;

public class CheckPrimeNum {
    public static void main(String[] args) {
        if(isPrime(10)){
            System.out.println("The number is Prime");
        }
        else {
            System.out.println("The number is Not Prime");
        }
    }
    public static boolean isPrime(int n){
     if (n <= 1)
         return false;
     for (int j = 2; j<= n /2 ; j++){
         if (n % j == 0) return false;
     }
     return true;
    }
}
