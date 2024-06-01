//Write a Java program that functions as a simple calculator (addition, subtraction, multiplication, division).


package practice;

public class CalculateAddSubMulDiv {
    public static void main(String[] args) {
        int x = 65;
        int y = 89;
        int add = CalAdd(x,y);
            System.out.println(add);
        int sub = CalSub(x,y);
            System.out.println(sub);
        int mul  = CalMul(x,y);
            System.out.println(mul);
        int div = CalDiv(x,y);
            System.out.println(div);
    }
    public static int CalAdd(int x,int y){
        return x + y;
    }
    public static int CalSub(int x,int y){
        return x - y;
    }
    public static int CalMul(int x,int y){
        return x * y;
    }
    public static int CalDiv(int x,int y){
        return x / y;
    }
}
