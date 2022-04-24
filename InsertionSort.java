import java.util.*;
import java.lang.Math;

public class JavaApplication {
    public static void main(String[] args) {
        int n, i, j, k;
        
        n = 12;
        int[] data = new int[n];
        
        data[0] = 40;
        data[1] = 2;
        data[2] = 1;
        data[3] = 43;
        data[4] = 3;
        data[5] = 65;
        data[6] = 0;
        data[7] = (int) (-1);
        data[8] = 68;
        data[9] = 3;
        data[10] = 42;
        data[11] = 4;
        
        // Cetak Array Data
        System.out.print("[ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print("  " + data[i]);
        }
        System.out.println("  ]");
        
        // Memulai Insertion Sort
        i = 1;
        while (i < n) {
            int temp;
            
            temp = data[i];
            boolean next;
            
            next = true;
            j = i;
            while (next == true) {
                if (temp < data[j - 1]) {
                    data[j] = data[j - 1];
                    j = j - 1;
                    if (j <= 0) {
                        next = false;
                    }
                } else {
                    next = false;
                }
            }
            data[j] = temp;
            i = i + 1;
        }
        
        // Cetak Hasil Sorting
        System.out.print("[ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print("  " + data[i]);
        }
        System.out.println("  ]");
    }
}
