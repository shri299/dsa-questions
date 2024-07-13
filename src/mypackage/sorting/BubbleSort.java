package mypackage.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {45,66,241,35,2,161,37};
        doBubbleSort(arr);
    }

    private static void doBubbleSort(int[] arr) {
        boolean flag = true;
        for (int i=0; i<arr.length-1 ;i++){
            for(int j = 1;j<=(arr.length-i-1);j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = false;
                }
                if (flag){
                    break;
                }
            }
        }

        for (int t = 0; t<arr.length;t++){
            System.out.println(arr[t]);
        }
    }
}
