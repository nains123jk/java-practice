package practice;

public class AreaRect {
    public static void main(String[] args) {
     int area = getArea(5,8);
        System.out.println("Area of Rectangle:" +area);
    }
    public static int getArea(int len, int wid){
        return len * wid;
    }
}