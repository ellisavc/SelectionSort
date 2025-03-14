import java.util.*;
//Ellis H
public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[30];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = 50 + (int) (Math.random() * 21);
        }
        System.out.println("Unsorted:");
        printArray(numbers);
        System.out.println("Sorted:");
        selectionSortArray(numbers);
        printArray(numbers);
    }

    public static void selectionSortArray(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }


    public static void printArray(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(count == 10){
                System.out.println();
                count = 0;
            }
            System.out.print(arr[i] + ", ");
            count++;
        }
        System.out.println();
    }
}