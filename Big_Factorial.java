package com.company;
import java.math.BigInteger;

class Big_Factorial {
    public static void main(String[] args) {
        System.out.println(fac(1000));
    }
     static BigInteger facRec(long n, int c) {

        if (c ==1000){
            return BigInteger.valueOf(0);
        }else {
            if (n == 1) {
                return BigInteger.valueOf(1);
            } else {
                return facRec(n - 1,++c).multiply(BigInteger.valueOf(n)) ;
            }
        }
     }

    public static BigInteger fac(int n) {

        BigInteger rus = new BigInteger("0");
        if (n>=1000){
            int tempC = n;
            while (true){
                if (tempC<=1000) {
                    rus = rus.add((facRec(tempC,0))); // rus + facRec(tempC,0);
                    break;
                }
                rus = rus.add((facRec(tempC,0)));
                tempC = tempC - 1000;
            }

        }
        return rus;
    }
}
