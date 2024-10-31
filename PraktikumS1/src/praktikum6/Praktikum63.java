package praktikum6;

import java.util.Scanner;

public class Praktikum63 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int menu;
        do{
        System.out.println("1. Lanjut");
        System.out.println("2. Berhenti");
        System.out.println("Pilih menu: ");
        menu = input.nextInt();
        
        if(menu == 1){
            System.out.println("Lanjut!");
        }else if(menu == 2){
            System.out.println("Program berhenti");
        }else if(menu < 3 || menu > 0 ){
            System.out.println("Menu tidak valid");
        }
        }while(menu == 1);
    }

}
