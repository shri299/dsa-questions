package mypackage.maths;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] arr = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        long value = 0L;
        for(int i=0;i<digits.length;i++){
            value = (long) (value + digits[i]*Math.pow(10,digits.length-i-1));
        }
        System.out.println(value);
        Long newValue = value + 1;
        System.out.println(newValue);

        ArrayList<Long> res = new ArrayList<>();

        while (newValue!=0){
            long remainder = newValue%10;
            res.add(remainder);
            newValue = newValue/10;
        }
        int[] finalRes = new int[res.size()];
        for (int i=0;i<res.size();i++){
            finalRes[i] = Math.toIntExact(res.get(res.size() - 1 - i));
        }
        return finalRes;
    }
}
