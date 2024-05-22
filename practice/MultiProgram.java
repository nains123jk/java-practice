package practice;

public class MultiProgram {
    public static void main(String[] args) {
        int a = 20;
        int b = 25;
        int div = getDiv(a);
        System.out.println(getDiv(a));
        int mul = getMul(a,b);
        System.out.println(getMul(a,b));
        int add = getAdd(a,b);
        System.out.println(getAdd(a,b));
        int sub = getSub(a,b);
        System.out.println(getSub(a,b));

    }


    public static int getDiv(int num){
        return  num/2;
    }
     public static  int getMul(int a, int b){
        return a * b;
     }
     public  static int getAdd(int a, int b){
        return a + b;
     }
     public  static int getSub(int a, int b){
        return a - b;
     }
}
