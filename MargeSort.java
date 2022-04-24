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
        
        // Memulai Merge Sort
        mergeSort(data, n);
        
        // Cetak Hasil Sorting
        System.out.print("[ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print("  " + data[i]);
        }
        System.out.println("  ]");
    }
    
    public static void merge(int[] data, int[] dataKiri, int[] dataKanan, int sData, int sKiri, int sKanan) {
        int n, i, j, k;
        
        n = sData;
        i = 0;
        j = 0;
        k = 0;
        while (i < sKiri && j < sKanan) {
            if (dataKiri[i] < dataKanan[j]) {
                data[k] = dataKiri[i];
                i = i + 1;
                k = k + 1;
            } else {
                data[k] = dataKanan[j];
                j = j + 1;
                k = k + 1;
            }
        }
        while (i < sKiri) {
            data[k] = dataKiri[i];
            i = i + 1;
            k = k + 1;
        }
        while (j < sKanan) {
            data[k] = dataKanan[j];
            j = j + 1;
            k = k + 1;
        }
    }
    
    public static void mergeSort(int[] data, int n) {
        if (n >= 2) {
            int tengah;
            
            tengah = (int) ((double) n / 2);
            int sKiri, sKanan;
            
            sKiri = tengah;
            sKanan = n - tengah;
            int[] dataKiri = new int[sKiri];
            int[] dataKanan = new int[sKanan];
            int i;
            
            for (i = 0; i <= sKiri - 1; i++) {
                dataKiri[i] = data[i];
            }
            for (i = 0; i <= sKanan - 1; i++) {
                dataKanan[i] = data[tengah + i];
            }
            mergeSort(dataKiri, sKiri);
            mergeSort(dataKanan, sKanan);
            merge(data, dataKiri, dataKanan, n, sKiri, sKanan);
        }
    }
}
