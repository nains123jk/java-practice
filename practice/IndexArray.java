package practice;

public class IndexArray {
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
        System.out.println(IndexArray(arr));
    }
    public static int IndexArray(int[]arr){
        return arr[arr.length - 2];
    }
}

