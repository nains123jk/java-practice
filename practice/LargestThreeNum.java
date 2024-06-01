//Write a Java program to find the largest of three numbers


package practice;

public class LargestThreeNum {
//    public static void main(String[] args) {
//        double n1 = 25, n2 = 35, n3 = 65;
//        if (n1 >= n2 && n1 >= n3){
//            System.out.println(n1 + "Is a largest number");
//    }
//else if (n2 >= n1 && n2 >= n3) {
//    System.out.println(n2 + "is a largest number");
//}
//    else {
//    System.out.println(n3+ "is the Largest Number");
//}
//    }


    public static void main(String[] args) {

        int largst;
       int a = 25;
        int b = 35;
       int c = 65;
        largst = LargeNum(a,b,c);
        System.out.println(largst + "Is a largest number");
    }
public static  int LargeNum(int a, int b,int c){
        return c > (a > b ? a:b) ? c : ((a > b)? a : b);
}
}
