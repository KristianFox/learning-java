package edu.java.academy.ex1.lqlq;

public class PrimeNumbers {
    private static boolean[] Prime;
    private static int MAX_PRIME_TO_CHECK= 1000;
    static {
     Prime=new boolean[MAX_PRIME_TO_CHECK+1];
        for (int i = 0; i <Prime.length ; i++) {
            Prime[i]=true;

        }
     Prime[0]=false;
        for (int numbers = 2; numbers <Prime.length ; numbers++) {
            if(Prime[numbers]==false){
                continue;
            }
            for (int offset = numbers; offset <Prime.length ; offset+=numbers) {
                Prime[offset]=false;
            }



        }


       // for (int i = 0; i <MAX_PRIME_TO_CHECK; i++) {

        //}
    }

    public static boolean isPrime(int numbers){
        return Prime[numbers];

    }
}
