package Praktikum4S2;

import java.util.Scanner;
import java.util.ArrayList;

public class Praktikum43S2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nilaiData = new ArrayList<>();
        int count = 0;
        int i = 0;
        
        for(i = 0; i < 10; i++){
            System.out.print("Masukkan data ke " + (i+1) + " : ");
            int data = input.nextInt();
            nilaiData.add(data);
        }
        
        System.out.print("Inputkan bilangan integer x: ");
        int x = input.nextInt();
        
        for(i = 0; i < nilaiData.size(); i++){
            if(nilaiData.get(i) == x){
                count++;
            }
        }
        
        if(count > 0){
            System.out.println("Jumlah bilangan x yang ada di dalam data sebanyak " + count + " buah");
        } else {
            System.out.println("Bilangan x tidak ditemukan di dalam data");
        }
        
        
    }
}
