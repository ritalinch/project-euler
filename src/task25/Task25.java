package task25;

import java.math.BigInteger;

public class Task25 {
    public static void main(String[] args) {
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;
        BigInteger sum;
        long counter = 1;
        while(second.toString().length() < 1000) {
            counter++;
            sum = second;
            second = first.add(second);
            first = sum;
        }
        System.out.println(counter);
    }
}
