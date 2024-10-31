import java.util.Scanner;

public class praktikum31 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bilangan;
        System.out.println("Bilangan: ");
        bilangan = scan.nextInt();

        if (bilangan % 5 == 0 && bilangan % 2 != 0) {
            System.out.println("Program Started");
        } else {
            System.out.println("Program Halted");
        }
    }
}
