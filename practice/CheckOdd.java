package practice;

public class CheckOdd {
    public static void main(String[] args) {
        int num = 11;
        if (checkodd(num)) {
            System.out.println("Odd num");
        } else {
            System.out.println("Even num");
        }

    }
    public static boolean checkodd ( int num){
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}


