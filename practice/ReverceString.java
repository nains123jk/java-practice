//Write a Java program to reverse a string.


package practice;

public class ReverceString {
    public static void main(String[] args) {
       String str = "Rayba Parrot";
       str = reverse(str);
        System.out.println("The reverse of String:" +str);
    }
    public static String reverse(String str){
        if (str == null || str.equals("")){
            return str;
        }
        return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
    }
}
