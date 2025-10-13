package dsa.binarysearch;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,3,6,10,14,23,29,31,46,50};
        List arrList = Arrays.asList(arr);
        int[] arr1 = {100,87,65,63,55,47,32,30,21,17,3,1};
        System.out.println(binarySearch(arr,35));
//        System.out.println(binarySearchDesc(arr1,100));
    }

    //arr in sorted in ascending order
    static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //find the middle element
            //the below is a better way to find mid, making sure that (start + mid) does not exceed the int range
            int mid = start + (end-start)/2;
            if (arr[mid]==key)
                return mid;
            else if (arr[mid]>key){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }


    //arr in sorted in descending order
    static int binarySearchDesc(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //find the middle element
            //the below is a better way to find mid, making sure that at not point (start + mid) exceed the int range
            int mid = start + (end-start)/2;
            if (arr[mid]==key)
                return mid;
            else if (arr[mid]>key){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    //order agnostic binary search - here we don't know whether the is sorted in asc or desc
    //check if arr[start] > arr[end] -> desc
    //check if arr[end] > arr[start] -> asc
}
