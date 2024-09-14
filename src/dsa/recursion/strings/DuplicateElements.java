package dsa.recursion.strings;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subset(arr));

    }

    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outerList = new ArrayList<>();

        for (int num : arr){
            if (outerList.isEmpty()){
                outerList.add(new ArrayList<>());
                outerList.add(new ArrayList<>(List.of(num)));
            }else {
                //add num to each sub list of outer list
                int n = outerList.size();
                for (int i=0;i<n;i++){
                    List<Integer> internal = new ArrayList<>(outerList.get(i));
                    internal.add(num);
                    //check if there is a list in the outer list which already contains the num
                    if (outerList.contains(internal)){
                        break;
                    }
                    outerList.add(internal);

                }
                //let the outer list be
            }
        }
        return outerList;
    }
}
