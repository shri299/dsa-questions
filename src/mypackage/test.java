package mypackage;

public class test {

    public static void main(String[] args) {
//        int n = 10;
//        int time = 38;
//
//        if (time<n){
//            System.out.println(time+1);
//        }
//        if (time>=n){
//            int quotient = time/(n-1);
//            int remainder = time % (n-1);
//
//            if (remainder!=0){
//                if (quotient%2!=0){
//                    System.out.println(n-remainder);
//                }else if (quotient%2==0){
//                    System.out.println(quotient+1);
//                }
//            } else{
//                if (quotient%2==0){
//                    System.out.println(1);
//                }else {
//                    System.out.println(n);
//                }
//            }
//        }

        System.out.println(passThePillow(10,38));
    }

    public static int passThePillow(int n, int time) {
        if (time<n){
            return (time+1);
        }
        if (time>=n){
            int quotient = time/(n-1);
            int remainder = time % (n-1);

            if (remainder!=0){
                if (quotient%2!=0){
                    return (n-remainder);
                }else if (quotient%2==0){
                    return (quotient+1);
                }
            } else{
                if (quotient%2==0){
                    return 1;
                }else {
                    return n;
                }
            }
        }
        return -1;
    }
}
