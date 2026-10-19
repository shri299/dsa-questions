package dsa.sorting;

import java.util.Arrays;

public class MergeSortInPlace {

    //TC: O(nlogn) SC: O(n)

    public static void main(String[] args) {
        int[] arr = {34,53,1,5,3,2,433,90};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }

        int mid = s + (e-s)/2;

        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);

        merge(arr,s,mid,e);
    }

    public static void merge(int[] arr,int s,int mid,int e){
        int[] mix = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=e){
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
        while (i<=mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j<=e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        //copy the mix array to original array from s to e
        for (int l=0;l<mix.length;l++){
            arr[s+l] = mix[l];
        }
    }
}