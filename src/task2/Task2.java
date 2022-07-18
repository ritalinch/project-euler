package task2;

public class Task2 {
    public static void main(String[] args) {
        long sum = 0;
        long fib1 = 1;
        long fib2 = 2;
        do {
            long fib3 = fib1 + fib2;
            sum += fib2;
            fib1 = fib3 + fib2;
            fib2 = fib3 + fib1;
        } while (fib1 < 4_000_000 && fib2 < 4_000_000);

        System.out.println(sum);
    }
}
