package task15;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        long[] arr = new long[20];
        Arrays.fill(arr, 1);
        for(int i = 0; i < arr.length; i++) {
            arr[0]++;
            for(int j = 1; j < arr.length; j++) {
                arr[j] = arr[j - 1] + arr[j];
            }
        }
        System.out.println(arr[arr.length -1]);
    }
}
