package practice;

public class MultiProgram {
    public static void main(String[] args) {
        int a = 20;
        int b = 25;
        int div = getDiv(a);
        System.out.println(div);
        int mul = getMul(a,b);
        System.out.println(mul);
        int add = getAdd(a,b);
        System.out.println(add);
        int sub = getSub(a,b);
        System.out.println(sub);

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
