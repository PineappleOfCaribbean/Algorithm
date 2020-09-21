package array;

import sun.security.util.Length;

import java.util.Arrays;

public class SortHeap {

    public static int[] sort(int[] arr){
         buildMaxHeap(arr);
        for (int i = arr.length -1; i >= 0;i--){
            swap(arr,0,i);
            heapify(arr,0,i);
        }
        return arr;
    }

    public static void buildMaxHeap(int[] arr){
        for (int i = (arr.length-1)/2;i>=0;i--){
            heapify(arr,i,arr.length);
        }
    }

    public static void heapify(int[] arr, int start, int end){
        int left = start * 2 + 1;
        int right = start * 2 + 2;
        int largest = start;

        if (left < end && arr[largest] < arr[left]){
            largest = left;
        }
        if (right < end && arr[largest] < arr[right]){
            largest = right;
        }
        if (largest != start){
            swap(arr,largest,start);
            heapify(arr,largest,end);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) throws Exception {

        System.out.println(Arrays.toString(sort(new int[]{1,8,2,3,4,5,6})));
    }

}
