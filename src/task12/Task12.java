package task12;

public class Task12 {
    public static void main(String[] args) {
        int triangle = 1;
        int n = 2;
        while (countDivisors(triangle) <= 500) {
            triangle += n;
            n++;
        }
        System.out.println(triangle);
    }

    private static int countDivisors(int n) {
        if (n == 1) {
            return 1;
        }
        int res = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                res += 2;
            }
        }
        if(Math.sqrt(n) * Math.sqrt(n) == n) {
            res++;
        }

        return res;
    }
}
