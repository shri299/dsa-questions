package dsa.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PaintersPartition {

    public static void main(String[] args) {
        //https://takeuforward.org/arrays/painters-partition-problem/
        //same as book allocation
        //min of maxes

        ArrayList<Integer> boards = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int k = 2; //number of painters
        int low = Collections.max(boards);
        int high = boards.stream().mapToInt(Integer::intValue).sum();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = countPainters(boards, mid);
            if (count > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(low);
    }

    private static int countPainters(ArrayList<Integer> boards, int mid) {
        int students = 1;
        int pagesWithStudent = 0;
        for (int j : boards) {
            if (pagesWithStudent + j <= mid) {
                pagesWithStudent = pagesWithStudent + j;
            } else {
                pagesWithStudent = j;
                students++;
            }
        }
        return students;
    }
}
