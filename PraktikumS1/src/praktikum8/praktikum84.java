package praktikum8;

import java.util.Scanner;

public class praktikum84 {

    public static String kalimatP(String kalimat) {
        return kalimat;
    }

    public static String kalimatP(String kalimat, String kalimat2) {
        return kalimat + ", " + kalimat2 + ", ";
    }
    
    public static String kalimatP(String kalimat, String kalimat2, String kalimat3){
        return kalimat + ", " + kalimat2 + ", " + kalimat3;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String lanjut = null;

        System.out.println("Masukkan kalimat: ");
        String kalimat1 = input.nextLine();
        System.out.println("Ingin melanjutkan kalimat?(y/n)");
        lanjut = input.nextLine();
        if (lanjut.equalsIgnoreCase("y")) {
            System.out.println("Masukkan kalimat: ");
            System.out.println(kalimatP(kalimat1) + ", ");
            String kalimat2 = input.nextLine();
            System.out.println("Ingin melanjutkan kalimat?(y/n)");
            lanjut = input.nextLine();
            if (lanjut.equalsIgnoreCase("y")) {
                System.out.println("Masukkan kalimat: ");
                System.out.println(kalimatP(kalimat1, kalimat2));
                String kalimat3 = input.nextLine();
                System.out.println(kalimatP(kalimat1, kalimat2, kalimat3));
            } else if(lanjut.equalsIgnoreCase("n")){
                System.out.println(kalimatP(kalimat1, kalimat2));
            }
        } else if (lanjut.equalsIgnoreCase("n")) {
            System.out.println(kalimatP(kalimat1));
        }

    }
}
