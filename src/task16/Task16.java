package task16;

import java.math.BigInteger;
import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(BigInteger.TWO.pow(1000).toString().split("")).mapToInt(Integer::parseInt).sum());
    }
}
