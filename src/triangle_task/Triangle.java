package triangle_task;

public class Triangle {
    public static void main(String[] args) {
        int n = 10;
        int k = 0;
        int counter = 1;
        boolean goBack = false;
        while(k < counter) {
            System.out.print("*");
            k ++;
            if(counter % n == 0) {
                goBack = true;
            }
            if(k == counter) {
                k = 0;
                if (goBack) {
                    counter --;
                } else {
                    counter ++;
                }
                System.out.println();
            }
        }
    }
}
