package array;

import java.util.Arrays;

public class SortQuickSort {

    public static int[] sort(int[] arr,int begin ,int end){
        if (begin >= end){
            return arr;
        }
        int partitionIndex = partition(arr, begin, end);
        sort(arr,begin,partitionIndex-1);
        sort(arr,partitionIndex+1,end);
        return arr;
    }

    public static int partition(int[] arr,int begin ,int end){
        int pivot = arr[begin];
        int i = begin;
        int j = end;
        while (i < j){
            while (arr[j] >= pivot && i<j){
                j--;
            }
            while (arr[i] <= pivot && i<j){
                i++;
            }
            swap(arr,i,j);
        }
        swap(arr,begin,i);
        return i;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(sort(new int[]{9,9,3,2,1,6,5,4},0,7)));
    }

}
