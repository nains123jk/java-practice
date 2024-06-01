//Write a Java program to find the LCM (Least Common Multiple) of two numbers.


package practice;

public class LeastCommonNum {
    public static void main(String[] args) {
    int x = 45,y = 25;
        System.out.println("LCM of" + x + "and" + y + "is" +LCM(x,y));
    }
public static int gcd(int x, int y){
      if (x == 0)
          return y;
      return gcd(y % x,x);
}
public static int LCM(int x,int y){
        return (x / gcd(x, y)) * y;
}
}
