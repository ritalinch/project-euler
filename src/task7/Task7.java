package task7;

public class Task7 {
    public static void main(String[] args) {
        int counter = 1;
        int number = 1;
        while(counter <= 10_001) {
            if (prime(++number)) {
                counter++;
            }
        }
        System.out.println(number);
    }

    private static boolean prime(int x) {
        for(int i = 2; i <= Math.sqrt(x); i++) {
            if ((x%i) == 0) return false;
        }
        return true;
    }
}
