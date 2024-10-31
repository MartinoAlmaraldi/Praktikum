package aaaaaaaaaaaaa;

import java.util.Scanner;

public class Aaaaaaaaaaaaa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        String username = "0", password = "0", userInput, passInput;
        do {
            System.out.println("==================================================\n\t\t\tMENU\n==================================================");
            System.out.println("1. Daftar\n2. Login");
            System.out.print("Silahkan pilih : ");
            menu = input.nextInt();
            System.out.println("==================================================");
            switch (menu) {
                case 1:
                    System.out.println("Silahkan isi data berikut");
                    System.out.print("Username : ");
                    username = input.nextLine();
                    input.nextLine();
                    System.out.print("Password : ");
                    password = input.nextLine();
                    System.out.println("Selamat Anda berhasil mendaftar!");
                break;
                case 2:
                    if (username.equals("0") && password.equals("0")) {
                        System.out.println("Anda belum mendaftar");
                    } else {
                        System.out.println("\nTime to Login!");
                        System.out.print("Username : ");
                        userInput = input.nextLine();
                        input.nextLine();
                        System.out.print("Password : ");
                        passInput = input.nextLine();
                        if (username.equals(userInput) && password.equals(passInput)) {
                            System.out.println("Selamat " + username + " telah berhasil login!");
                            anggaranPemerintah();
                        } else {
                            System.out.println("Username atau Password anda salah");
                            System.out.println("Silahkan coba lagi");
                        }
                    }
                    break;
                default:
                    System.out.println("Inputan anda tidak valid!");
                    break;
            }
        } while (menu != 3);

    }

    public static void anggaranPemerintah() {
        Scanner pilih = new Scanner(System.in);
        System.out.println("================================================\n\t\tMENU ANGGARAN\n================================================");
        System.out.println("");
    }
}
