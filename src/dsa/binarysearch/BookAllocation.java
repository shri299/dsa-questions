package dsa.binarysearch;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class BookAllocation {

    public static void main(String[] args) {
        //https://takeuforward.org/data-structure/allocate-minimum-number-of-pages/
        int[] arr = {23,12,45,66,34};
        int k = 4;
        int start = 66; //max of array
        int end = 180; //sum of all elements of array

        while(start<=end){
            int mid = (start+end)/2;
            int count = countStudents(arr,mid);
            if (count>k){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        System.out.println(start);
    }

    private static int countStudents(int[] arr, int maxPage){
        int students = 1;
        int pagesWithStudent = 0;
        for (int j : arr) {
            if (pagesWithStudent + j <= maxPage) {
                pagesWithStudent = pagesWithStudent + j;
            } else {
                pagesWithStudent = j;
                students++;
            }
        }
        return students;
    }
}
