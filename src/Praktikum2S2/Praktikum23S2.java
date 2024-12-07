package Praktikum2S2;
import java.util.Scanner;
public class Praktikum23S2 {
    
    public static int rentang(int a, int b, int c, int panjang){
        while(c <= panjang){
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    
    public static void start(){
        System.out.println("-Rentang bilangan fibonacci-");
        System.out.println("Batas nilai fibonacci: ");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int panjang, a = 0, b = 1, c = 0;
        start();
        panjang = input.nextInt();
        System.out.println("Rentang bilangan fibonacci sampai " + panjang + ": ");
        rentang(a, b, c, panjang);
        
    }
}
