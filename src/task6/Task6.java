package task6;

public class Task6 {
    public static void main(String[] args) {
        int n = 100;
        long res = 0;
        int tempSum = 0;
        for (int i = 1; i <= n; i++) {
            tempSum += i;
        }

        for (int i = 1; i < n - 1; i++) {
            tempSum -= i;
            res += 2L * i * tempSum;
        }

        res += 2L * n * (n - 1);
        System.out.println(res);
    }
}
