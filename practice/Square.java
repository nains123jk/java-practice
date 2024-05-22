package practice;

public class Square {
    public static void main(String[] args) {
        int square = getSquare(2);
        System.out.println("square is:"+square);
    }
    public static int getSquare(int num){
        return num*num;
    }
}
