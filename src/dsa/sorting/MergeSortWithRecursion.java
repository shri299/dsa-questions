package dsa.sorting;

import java.util.Arrays;

public class MergeSortWithRecursion {

    //time complexity -> O(nlog(n))
    //space complexity ->

    public static void main(String[] args) {
        int[] arr = {34,53,1,5,3,2,433,90};
        int[] num  = mergeSort(arr);
        System.out.println(Arrays.toString(num));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        //copy of range -> copies the specified range into a new array(the to value is exclusive)
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    public static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<left.length && j<right.length){
            if (left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }


        //add all the leftover elements
        while (i<left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j<right.length){
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }
}
