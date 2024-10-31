
package aaaaaaaaaaaaa;
import java.util.Scanner;
import java.util.ArrayList;

public class awdnwuibfuwa {
   


public class aa {

    static Scanner input = new Scanner(System.in);
    static String inputNama;
    static int inputMhs, inputNilai, inputNilai2, inputNilai3;
    static double rerata;

    public static void main(String[] args) {
        ArrayList <String> nama = new ArrayList<>();
        ArrayList nilai = new ArrayList();
        ArrayList nilai2 = new ArrayList();
        ArrayList nilai3 = new ArrayList();
        ArrayList rata2 = new ArrayList();

        System.out.print("Jumlah Mhs : ");
        inputMhs = input.nextInt();
        System.out.println("");

        for (int i = 0; i < inputMhs; i++) {
            System.out.print("Nama Mhs " + (i + 1) + " : ");
            input.nextLine();
            inputNama = input.nextLine();
            nama.add(inputNama);
            System.out.print("Nilai mata kuliah 1 : ");
            inputNilai = input.nextInt();
            nilai.add(inputNilai);
            System.out.print("Nilai mata kuliah 2 : ");
            inputNilai2 = input.nextInt();
            nilai2.add(inputNilai2);
            System.out.print("Nilai mata kuliah 3 : ");
            inputNilai3 = input.nextInt();
            nilai3.add(inputNilai3);

            rerata = (inputNilai + inputNilai2 + inputNilai3) / 3;
            rata2.add(rerata);
            System.out.println("");
        }
        System.out.println("|\tnama\t|\tMatkul 1\t|\tMatkul 2\t|\tMatkul 3\t|\tRata-rata\t|");
        for (int i = 0; i < nama.size(); i++) {
            System.out.println("|" + nama.get(i) + "\t|\t" + nilai.get(i) + "\t|\t" + nilai2.get(i) + "\t|\t" + nilai3.get(i) + "\t|\t" + rata2.get(i) + "\t|");
     }
    }
}
}
