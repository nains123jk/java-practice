package practice;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; ++i)
        {
            if (i > 5 && i < 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}

