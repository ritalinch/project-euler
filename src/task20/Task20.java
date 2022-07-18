package task20;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task20 {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(IntStream.range(1, 101).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply).toString().split("")).mapToInt(Integer::parseInt).sum());
    }
}
