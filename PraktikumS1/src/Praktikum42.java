
import java.util.Scanner;
public class Praktikum42 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String jawaban;
       
       System.out.println("Berapa hasil dari 5 + 7?");
       System.out.println("A. 4");
       System.out.println("B. 9");
       System.out.println("C. 14");
       System.out.println("D. 12");
       System.out.print("Pilih jawaban: ");
       jawaban = input.nextLine();
       
       switch(jawaban) {
           case "A":
           case "a":
           case "B":
           case "b":
           case "C":
           case "c":
               System.out.println("jawaban salah");
           break;
           
           case "D":
           case "d":
               System.out.println("Jawaban benar");
           break;
           default:
               System.out.println("ERROR");
               
               
       }
    }
    
}
