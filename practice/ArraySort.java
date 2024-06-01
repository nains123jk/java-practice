//Write a Java program to sort an array of integers


package practice;

public class ArraySort {
    public static void main(String[] args)
    {

        int[] array = new int[] { -15, -9, 8, 122, 61, 35 };

        length = array.length;

        System.out.print("Elements of original array: ");
        SortArray(array);
    }
        static int length;
        public static void PrintArray(int[] array)
        {
            for (int i = 0; i < length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        public static void SortArray(int[] array)
        {
            int temporary = 0;
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (array[i] > array[j]) {
                        temporary = array[i];
                        array[i] = array[j];
                        array[j] = temporary;
                    }
                }
            }
            System.out.println("Elements of array sorted in ascending order: ");
            PrintArray(array);
        }
    }

