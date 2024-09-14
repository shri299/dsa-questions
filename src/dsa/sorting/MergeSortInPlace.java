package dsa.sorting;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {
        int[] arr = {34,53,1,5,3,2,433,90};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }

        int mid = (s+e)/2;

        //copy of range -> copies the specified range into a new array(the to value is exclusive)
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }

    public static void mergeInPlace(int[] arr, int s, int mid, int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i<mid && j<e){
            if (arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }


        //add all the leftover elements
        while (i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int t = 0; t<mix.length;t++){
            arr[s+t] = mix[t];
        }
    }
}
