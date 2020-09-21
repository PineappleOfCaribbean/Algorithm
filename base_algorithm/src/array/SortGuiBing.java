package array;

import java.util.Arrays;

public class SortGuiBing {

    public static int[] sort(int[] arr){
        if (arr.length <= 1){
            return arr;
        }

        int[] left = Arrays.copyOfRange(arr,0,arr.length/2);
        int[] right = Arrays.copyOfRange(arr,arr.length/2,arr.length);

        return merge(sort(left),sort(right));
    }

    public static int[] merge(int[] left,int[] right){
        int resultLength = left.length+right.length;
        int[] result = new int[resultLength];
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                result[i+j] = left[i++];
            }else {
                result[i+j] = right[j++];
            }
        }

        while (i < left.length){
            result[i+j] = left[i++];
        }

        while (j < right.length){
            result[i+j] = right[j++];
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sort(new int[]{9,9,3,2,1,6,5,4})));
    }

}
