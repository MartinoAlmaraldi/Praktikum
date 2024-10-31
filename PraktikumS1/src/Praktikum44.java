
import java.util.Scanner;
public class Praktikum44 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String unsur;
        
        System.out.print("Masukkan salah satu unsur pembentuk sejarah: ");
        unsur = input.nextLine();
        
        switch(unsur){
            case "Manusia":
            case "Ruang":
            case "Waktu":
                System.out.println(unsur + "merupakan salah satu unsur penting pembentuk sejarah");
            break;
        
            default:
                System.out.println(unsur + "bukanlah salah satu unsur penting pembentuk sejarah");
        }
        
    }
    
}
