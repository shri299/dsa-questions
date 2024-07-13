package mypackage;

public class CielNumberBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,3,6,10,14,23,29,31,46,50};
        System.out.println(ceilNumber(arr,5));
    }

    static int ceilNumber(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid] == key)
                return key;
            if (arr[mid]>key){
                if(arr[mid-1]<key){
                    return arr[mid];
                }
                end = mid;
            }
            if (arr[mid]<key){
                start = mid + 1;
            }
        }

//        if(arr[end]>=key && arr[start]<key){
//            return arr[end];
//        }
//        if (arr[start]==key){
//            return arr[start];
//        }

        return -1;
    }
}
