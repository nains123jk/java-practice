package practice;
public class Odd1to100for {
    public static void main(String[] args) {
        int num=100;
        System.out.print("List of even numbers from 1 to "+num+": ");
        for (int i=1; i<=num; i++)
        {
            if (i%2!=0)
            {
                System.out.print(i + " ");
            }
        }
    }
}

