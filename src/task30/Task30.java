package task30;

public class Task30 {
    public static void main(String[] args) {
        long sum = 0;
        for(int i = 2; i < Integer.MAX_VALUE; i++) {
            if (i == getPower(i)) {
                sum += i;
                System.out.println(sum);
            }
        }
    }

    private static long getPower(int i) {
        return (long) ("" + i).chars().map(c ->  c - 48).mapToDouble(ii -> Math.pow(ii, 5)).sum();
    }
}
