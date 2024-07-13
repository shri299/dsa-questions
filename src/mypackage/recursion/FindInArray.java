package mypackage.recursion;

import java.util.ArrayList;

public class FindInArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
//        System.out.println(find(arr,1,0));
        System.out.println(findAll(arr,4,0));
    }

    public static int find(int[] arr, int key, int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index]==key){
            return index;
        }
        return find(arr,key,index+1);
    }

    public static ArrayList<Integer> findAll(int[] arr, int key, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr.length){
            return list;
        }
        if (arr[index]==key){
            list.add(index);
        }
        return combineList(list, findAll(arr,key,index+1));
    }

    public static ArrayList<Integer> combineList(ArrayList<Integer> list, ArrayList<Integer> all) {
        list.addAll(all);
        return list;
    }
}
