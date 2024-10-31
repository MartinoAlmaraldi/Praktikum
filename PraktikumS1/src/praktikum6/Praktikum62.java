package praktikum6;
import java.util.Scanner;
public class Praktikum62 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka: ");
        int mawar = input.nextInt();
        int layu = mawar-1;
        while(mawar > 0){
            while(layu < mawar){
                if (layu == 0){
                    System.out.println("Bunga mawar mekarlah " + mawar + ", layu 1 habis semua");
                }else if (layu > 0)
                System.out.println("Bunga mawar mekarlah " + mawar + ", layu 1 tinggalah " + layu);
                layu--;
            }
            mawar--;
        }
        
    }
}
