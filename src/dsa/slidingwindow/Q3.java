package dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class Q3 {

    //anagrams in a sub sequence

    public static void main(String[] args) {
        System.out.println(method2("aabcaab","aab"));
    }

    public static int calculate(String pattern, String s){
        char[] arr = pattern.toCharArray();
        char[] arr1 = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int count = 0;

        //store the small string in hashmap
        for (char c : arr1){
            updateMap(map,c);
        }

        Map<Character,Integer> targetMap = new HashMap<>();

        //iterate for the first window
        while (i+j<arr1.length){
           updateMap(targetMap,arr[j]);
            j++;
        }
        //check if anagram
        checkIfAnagram(count,targetMap,map);


        while (j<arr.length){
            //remove the old ith one from the map
            map.put(arr[i],map.get(arr[i])-1);
            //increment i
            i++;

            //increment j
            j++;
            //add the new jth element
            updateMap(targetMap,arr[j]);

            //check if anagram
            checkIfAnagram(count,targetMap,map);
        }
        return count;
    }

    public static void updateMap(Map<Character,Integer> map, char c){
        if (map.containsKey(c)){
            map.put(c,map.get(c)+1);
        }else {
            map.put(c,1);
        }
    }

    public static void checkIfAnagram(int count, Map<Character, Integer> targetMap, Map<Character, Integer> map){
        if (targetMap.size()!=map.size()){
            return;
        }else if (targetMap.keySet()!=map.keySet()){
            return;
        }
    }

    public static int method2(String pattern, String s){
        char[] arr = pattern.toCharArray();
        char[] arr1 = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int ans = 0;

        //store the small string in hashmap
        for (char c : arr1){
            updateMap(map,c);
        }
        int size = map.size();

        //aaba
        //aab

        while (j<arr.length){
            if (map.containsKey(arr[j])){
                map.put(arr[j],map.get(arr[j])-1);
                if (map.get(arr[j])==0){
                    size--;
                }
            }
            if (j+i+1<3){
                j++;
                continue;
            }
            if (size==0){
                ans++;
                System.out.println(i+" "+j);
            }
            //remove current ith
            if (map.containsKey(arr[i]))
            {
                int a = map.get(arr[i]);
                if(a==0){
                    size++;
                }
                map.put(arr[i], ++a);
            }
            i++;
            j++;
        }

        return ans;
    }
}
