package task3;

public class Task3 {
    public static void main(String[] args) {
        getDivs();
    }

    private static void getDivs() {
        int i;
        long num = 408464633;
        for (i = 2; i < Math.sqrt(1. * num); i++) {
            if (num % i == 0) {
                System.out.println(i);
                System.out.println(num / i);
                num /= i;
            }
        }
    }
}