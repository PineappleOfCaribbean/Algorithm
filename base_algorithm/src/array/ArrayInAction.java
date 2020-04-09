package array;

import java.util.Arrays;

import static array.ArrayInAction.merge;

public class ArrayInAction {

    //合并两个有序数组，假设arr1和arr2自增有序
    public static int[] merge(int[] arr1, int[] arr2){
        int idx1 = 0;
        int idx2 = 0;
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];
        int idx3 = 0;
        while (idx1 < arr1.length){
            arr3[idx3++] = idx2 < arr2.length && arr1[idx1] >= arr2[idx2] ? arr2[idx2++] : arr1[idx1++];
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,6};
        int[] arr2 = {2,3,5};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }

}
