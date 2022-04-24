import java.util.*;
import java.lang.Math;

public class JavaApplication {
    public static void main(String[] args) {
        int n, i, j, k, m;
        
        n = 12;
        int[] data = new int[n];
        
        data[0] = 40;
        data[1] = 2;
        data[2] = 1;
        data[3] = 43;
        data[4] = 3;
        data[5] = 65;
        data[6] = 0;
        data[7] = 1;
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
        
        // Memulai Radix Sort
        int mAX;
        
        mAX = (int) (-99999);
        
        // Mencari nilai MAX untuk menentukan level terstinggi apakah satuan, puluhan, ratusan, ribuan, dll
        for (i = 0; i <= n - 1; i++) {
            if (data[i] > mAX) {
                mAX = data[i];
            }
        }
        int mAXLEVEL, pembagi, hasilBagi;
        
        mAXLEVEL = 1;
        pembagi = 1;
        hasilBagi = (int) ((double) mAX / pembagi);
        while (hasilBagi >= 10) {
            mAXLEVEL = mAXLEVEL + 1;
            pembagi = pembagi * 10;
            hasilBagi = (int) ((double) mAX / pembagi);
        }
        
        // memulai penelusuran Radix dan peletakan ke Bucket berdasarkan nilai LSD pada setiap level
        pembagi = 1;
        int pembagiSisa;
        
        pembagiSisa = 1;
        for (m = 1; m <= mAXLEVEL; m++) {
            pembagi = pembagi * 10;
            
            // mendeklarasikan Array Bucket dan indexArray Bucket
            // ada 10 array bucket dari 0 - 9
            int[] bucket0 = new int[n], bucket1 = new int[n], bucket2 = new int[n], bucket3 = new int[n], bucket4 = new int[n], bucket5 = new int[n], bucket6 = new int[n], bucket7 = new int[n], bucket8 = new int[n], bucket9 = new int[n];
            int index0, index1, index2, index3, index4, index5, index6, index7, index8, index9;
            
            index0 = 0;
            index1 = 0;
            index2 = 0;
            index3 = 0;
            index4 = 0;
            index5 = 0;
            index6 = 0;
            index7 = 0;
            index8 = 0;
            index9 = 0;
            
            // memulai peletakan ke bucket
            for (i = 0; i <= n - 1; i++) {
                int value;
                
                value = data[i];
                int sisa;
                
                sisa = value % pembagi;
                int posisi;
                
                posisi = (int) ((double) sisa / pembagiSisa);
                
                // meletakkan value ke bucket sesuai index posisinya
                if (posisi == 0) {
                    bucket0[index0] = value;
                    index0 = index0 + 1;
                } else {
                    if (posisi == 1) {
                        bucket1[index1] = value;
                        index1 = index1 + 1;
                    } else {
                        if (posisi == 2) {
                            bucket2[index2] = value;
                            index2 = index2 + 1;
                        } else {
                            if (posisi == 3) {
                                bucket3[index3] = value;
                                index3 = index3 + 1;
                            } else {
                                if (posisi == 4) {
                                    bucket4[index4] = value;
                                    index4 = index4 + 1;
                                } else {
                                    if (posisi == 5) {
                                        bucket5[index5] = value;
                                        index5 = index5 + 1;
                                    } else {
                                        if (posisi == 6) {
                                            bucket6[index6] = value;
                                            index6 = index6 + 1;
                                        } else {
                                            if (posisi == 7) {
                                                bucket7[index7] = value;
                                                index7 = index7 + 1;
                                            } else {
                                                if (posisi == 8) {
                                                    bucket8[index8] = value;
                                                    index8 = index8 + 1;
                                                } else {
                                                    if (posisi == 9) {
                                                        bucket9[index9] = value;
                                                        index9 = index9 + 1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            pembagiSisa = pembagiSisa * 10;
            
            // mengembalikan value ke array data sesuai urutan dari bucket
            k = 0;
            j = 0;
            while (j < index0) {
                data[k] = bucket0[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index1) {
                data[k] = bucket1[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index2) {
                data[k] = bucket2[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index3) {
                data[k] = bucket3[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index4) {
                data[k] = bucket4[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index5) {
                data[k] = bucket5[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index6) {
                data[k] = bucket6[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index7) {
                data[k] = bucket7[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index8) {
                data[k] = bucket8[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index9) {
                data[k] = bucket9[j];
                k = k + 1;
                j = j + 1;
            }
        }
        
        // Cetak Hasil Sorting
        System.out.print("[ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print("  " + data[i]);
        }
        System.out.println("  ]");
    }
}
