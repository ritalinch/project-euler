package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> prims = new ArrayList<>();
        int temp;
        for (int i = 2; i < 20; i++) {
            temp = i;
            for (Integer prim : prims) {
                if (temp % prim == 0) {
                    temp /= prim;
                }
            }
            if(temp != 1) {
                prims.add(temp);
            }
        }
        AtomicInteger res = new AtomicInteger(1);
        prims.forEach(i -> res.updateAndGet(v -> v * i));
        System.out.println(res);
    }
}
