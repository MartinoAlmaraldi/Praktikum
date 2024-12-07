package praktikum1s2;

import java.util.Scanner;

public class Praktikum12S2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan = ");
        int nilai = input.nextInt();
        
        for(int i = 0 ; i<= nilai-1 ; i++){
            for (int j = 0 ; j<i ; j++){
                System.out.print(" ");
            }
            for (int k = i ; k <= nilai-1 ; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
        for (int i = nilai-1; i >= 0 ; i--){
            for (int j = 0 ; j<i ; j++ ){
                System.out.print(" ");
            }
            for(int k = i ; k <= nilai-1 ; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
    }
}
