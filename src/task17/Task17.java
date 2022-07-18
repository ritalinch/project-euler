package task17;

import java.util.HashMap;
import java.util.Map;

public class Task17 {
    private static final Map<Integer, String> words = new HashMap<>();
    private static final int hundred = 7;
    private static final int and = 3;

    public static void main(String[] args) {
        words.put(1, "one");
        words.put(2, "two");
        words.put(3, "three");
        words.put(4, "four");
        words.put(5, "five");
        words.put(6, "six");
        words.put(7, "seven");
        words.put(8, "eight");
        words.put(9, "nine");
        words.put(10, "ten");
        words.put(11, "eleven");
        words.put(12, "twelve");
        words.put(13, "thirteen");
        words.put(14, "fourteen");
        words.put(15, "fifteen");
        words.put(16, "sixteen");
        words.put(17, "seventeen");
        words.put(18, "eighteen");
        words.put(19, "nineteen");
        words.put(20, "twenty");
        words.put(30, "thirty");
        words.put(40, "forty");
        words.put(50, "fifty");
        words.put(60, "sixty");
        words.put(70, "seventy");
        words.put(80, "eighty");
        words.put(90, "ninety");
        words.put(1000, "onethousand");

        long sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (words.containsKey(i)) {
                sum += words.get(i).length();
            } else if (i / 100 == 0) {
                sum += words.get(i % 10).length() + words.get(i - i % 10).length();
            } else {
                sum += words.get(i / 100).length() + hundred;
                int n = i % 100;
                if (n == 0) {
                    continue;
                }
                sum += and;
                sum += words.containsKey(n)
                        ? words.get(n).length()
                        : words.get(n % 10).length() + words.get(n - n % 10).length();
            }
        }

        System.out.println(sum);
    }
}
