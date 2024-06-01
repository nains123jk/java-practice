//Write a Java program to check if a string is a palindrome.

package practice;

public class palindrome {
    public static void main(String[] args) {
String str = " Naina Junnake";
str = str.toLowerCase();
boolean A = Palindromic(str);
        System.out.println(A);
    }
    public static boolean Palindromic(String str){
        String rev  = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)){
            ans = true;
        }
        return ans;
    }
}
