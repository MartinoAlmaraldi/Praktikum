
import java.util.Scanner;

public class Praktikum22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nilai a = ");
        int a = scan.nextInt();
        String kondisi = a % 2==0 ? "a merupakan bilangan genap" : "a merupakan bilangan ganjil";
        System.err.println("Nilai a merupakan bilangan genap/ganjil? " + kondisi);

    }
}