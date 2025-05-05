package dsa.slidingwindow;

import java.util.*;

public class Q5 {

    //longest substring with at most k distinct characters

    public static void main(String[] args) {
        String s = "aaaabbccd";
        int k = 2;
        char[] arr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right<s.length()){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);

            if (map.size()>k){
                //unstable state
                while (map.size()>k){
                    map.put(arr[left],map.get(arr[left])-1);
                    if(map.get(arr[left])==0){
                        map.remove(arr[left]);
                    }
                    left++;
                }
            }

            maxLength = Math.max(maxLength,right-left+1);
            right++;
        }

        System.out.println("The answer is: "+maxLength);
    }
}
