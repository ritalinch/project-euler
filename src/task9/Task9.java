package task9;

public class Task9 {
    public static void main(String[] args) {
        for (int i = 1; i < 499; i ++){
            for (int j = i; j < 499; j ++) {
                int c = 1000 - i - j;
                if (i*i + j*j == c*c) {
                    System.out.println(i * j * c);
                    return;
                }
            }
        }
    }
}
