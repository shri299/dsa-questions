package dsa.binarysearch;

public class InfiniteArray {

    public static void main(String[] args) {

    }

    static int ans(int[] arr,int key){
        int start=0;
        int end=1;
        while (key>arr[end]){
            int newStart = end+1; //6
            end = end + (end-start + 1)*2;
            start = newStart;
        }

        return binarySearch(arr,key,start,end);
    }

    static int binarySearch(int[] arr,int key, int start, int end){
        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]== key){
                return key;
            } else if (key>arr[mid]) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
