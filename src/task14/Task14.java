package task14;

public class Task14 {
    public static void main(String[] args) {
        int maxNum = 0;
        int maxLen = 0;
        for (int i = 1; i <= 1_000_000; i++) {
            int len = getSequenceLen(i);
            if(maxLen < len) {
                maxNum = i;
                maxLen = len;
            }
        }
        System.out.println(maxNum);
    }

    private static int getSequenceLen(long n) {
        if(n == 1) {
            return 1;
        }
        else {
            int counter = 1;
            while(n != 1) {
                n = nextTerm(n);
                counter++;
                if(counter > 10_000) System.exit(1);
            }
            return counter;
        }
    }
    private static long nextTerm(long n) {
        if(n % 2 == 0) {
            return n/2;
        } else {
            return n * 3 + 1;
        }
    }
}

