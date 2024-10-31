/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaaaaaaaaaaaa;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class insertionSort {
      // Method untuk Selection Sort berdasarkan ID
    public void sortById(ArrayList<MarathonData> dataList, boolean ascending) {
        int n = dataList.size();
        for (int i = 0; i < n - 1; i++) {
            // Menemukan elemen terkecil atau terbesar di subarray yang belum terurut
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                // Konversi ID dari String ke Integer
                int id1 = Integer.parseInt(dataList.get(minIdx).getId());
                int id2 = Integer.parseInt(dataList.get(j).getId());

                if (ascending) {
                    // Urutkan secara ascending berdasarkan ID
                    if (id2 < id1) {
                        minIdx = j;
                    }
                } else {
                    // Urutkan secara descending berdasarkan ID
                    if (id2 > id1) {
                        minIdx = j;
                    }
                }
            }
            // Tukar elemen jika diperlukan
            swap(dataList, i, minIdx);
        }
    }

    // Method untuk menukar elemen dalam ArrayList
    private void swap(ArrayList<MarathonData> dataList, int i, int j) {
        MarathonData temp = dataList.get(i);
        dataList.set(i, dataList.get(j));
        dataList.set(j, temp);
    }
}
