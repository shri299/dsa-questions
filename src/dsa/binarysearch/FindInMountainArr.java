package dsa.binarysearch;

public class FindInMountainArr {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(2,arr));
    }

    public static int findInMountainArray(int target, int[] arr) {
        int peakIndex = getPeak(arr);
        int size = arr.length-1;
        int res = binarySearchAsc(arr,0,peakIndex,target);
        System.out.println(res);
        int resOne = binarySearchDesc(arr,peakIndex+1,size,target);
        System.out.println(resOne);
        if(res==-1 && resOne!=-1){return resOne;}
        else if(res!=-1 && resOne==-1){return res;}
        else if(res>=resOne){return resOne;}
        else if(res<=resOne){return res;}
        return -1;
    }

    public static int  getPeak(int[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            } else if(arr[mid]>arr[mid+1]){
                end = mid;
            }
        }

        return start;
    }

    public static int binarySearchAsc(int[] arr, int start,int end,int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            } else if (arr[mid]>target){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchDesc(int[] arr, int start,int end,int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            } else if (arr[mid]>target){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
