package praktikum5;
import java.util.Scanner;
public class Praktikum51 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int max = -99999;
        int min = 99999;    
        int angka;
        int ratarata = 0;
        System.out.println("Masukkan Jumlah Angka: ");
        angka = input.nextInt();
        
        for(i = 1; i <= angka; i++){
            System.out.println("Masukkan angka ke- " + i + ": ");
            int angka1 = input.nextInt();
            
            if(angka1<min){
                min = angka1;
            }
            if (angka1>max){
                max = angka1;
            }
            ratarata += angka1/angka;
            
            }
        
        System.out.println("Nilai maksimum: " + max);
        System.out.println("Nilai minimum : " + min);
        System.out.println("Rata-rata     : " + ratarata);
        }
       
    }
