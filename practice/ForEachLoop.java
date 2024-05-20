package practice;

public class ForEachLoop {
    public static void main(String[] args) {
        int[]numbers = {3,4,5,6,7,8,9,12,14,16,18,19};
                int sum = 0;
                for(int number : numbers){
                    sum += number;
                }
        System.out.println("sum = " + sum);
    }
}
