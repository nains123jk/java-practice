package practice;

public class CheckEven {
    public static void main(String[] args) {
        int num = 11;
        if (checkEven(num)) {
            System.out.println("Even num");
        }else
            System.out.println("Odd num");
    }

    public static boolean checkEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


