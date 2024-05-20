package practice;

public class DoWhileLoop {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        do{
            sum += num;
            System.out.println("Enter a Number");
        }
        while (num >= 0);
        System.out.println("sum="+sum);
    }
}
