package praktikum1s2;
import java.util.Scanner;
public class Praktikum22S2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, nilai;
        double ratarata = 0;
        int i = 1;
        String jawaban = null;
        
        do{
            System.out.println("Inputkan nilai ke-" + i + ": ");
            nilai = input.nextInt();
            
             
            if(nilai < min){
                min = nilai;
            }
            if (nilai > max){
                max = nilai;
            }
            
            ratarata += nilai;
            
            
            
            System.out.println("Apakah ingin lanjut input?");
            jawaban = input.next();
           
            i++;
            
        }while(jawaban.equalsIgnoreCase("y"));
        System.out.println("---------------------");
        System.out.println("Nilai terbesar = " + max);
        System.out.println("Nilai Terkecil = " + min);
        System.out.println("NIlai Rata-rata = " + ratarata/(i-1));
        System.out.println("---------------------");
    }
}
