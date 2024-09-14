package dsa;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1,54,0,76,23,5,29,10,2};
        int key = 10;
        System.out.println(linearSearch(arr,key));
        String str = "Srishti";
        char str_key = 'h';
        System.out.println(stringSearch(str,str_key));
    }

    static int linearSearch(int[] arr, int key){
        if (arr.length==0)
                return -1;
        for(int i=0;i<arr.length;i++){
            if (key==arr[i])
                return i;
        }

        return -1;
    }

    static boolean stringSearch(String str,char str_key){

        if (str.isEmpty())
            return false;
        for(int i=0;i<str.length();i++){
            if (str_key==str.charAt(i))
                return true;
        }

//        for (char ch: str.toCharArray()){
//            if (ch==str_key)
//                return true;
//        }

        return false;
    }
}
