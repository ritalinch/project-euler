package task10;

public class Task10 {
    public static void main(String[] args) {
        long sum = 0;
        for(int i = 2; i < 100; i++) {
            if (prime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean prime(int x) {
        for(int i = 2; i <= Math.sqrt(x); i++) {
            if ((x%i) == 0) return false;
        }
        return true;
    }
}
