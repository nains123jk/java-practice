package practice;

public class AddTwoSum {
    public static void main(String[] args) {
        int i1 = AddThreeNum(1, 4, 6);
        System.out.println(i1);
//        int a =10;
//        int b= 20;
        int i = AddTwonum(10, 20);
        System.out.println(i);

    }

    public static int AddTwonum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int AddThreeNum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
}



