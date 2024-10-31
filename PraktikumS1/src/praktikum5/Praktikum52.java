package praktikum5;
import java.util.Scanner;
public class Praktikum52 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
       
        int i,j,k,b, tinggi;
        
        System.out.println("Masukkan tinggi segitiga: ");
        tinggi = input.nextInt();
        
        for(i = 1 ; i <= tinggi; i++){
            for(j = 10; j >= i ; j--){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print("*");
            }
            for(b = 1 ; b <= i - 1; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
