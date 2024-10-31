
import java.util.Scanner;
public class Praktikum41 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        double a = 0;
        double b = 0;
        double c = 0;
      
        
        
        System.out.println("1. Menentukan nilai sisi a");
        System.out.println("2. Menentukan nilai sisi b");
        System.out.println("3. Menentukan nilai sisi c");
        
        System.out.print("Masukkan pilihan Anda: ");
        menu = input.nextInt();
        
        
        switch(menu){
            case 1: 
                System.out.print("Nilai sisi b: ");
                b = input.nextInt();
                System.out.print("Nilai sisi c: ");
                c = input.nextInt();
                double nilai1 = Math.sqrt(Math.pow(c,2) - Math.pow(b,2));
                System.out.println("Maka nilai sisi a adalah: " + nilai1);
            break;
            
            case 2:
                System.out.print("Nilai sisi a: ");
                a = input.nextInt();
                System.out.print("Nilai sisi c: ");
                c = input.nextInt();
                double nilai2 = Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
                System.out.println("Maka nilai sisi b adalah: " + nilai2);
            break;
            
            case 3:
                System.out.print("Nilai sisi a: ");
                a = input.nextInt();
                System.out.print("Nilai sisi b: ");
                b = input.nextInt();
                double nilai3 = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
                System.out.println("Maka nilai sisi c adalah: " + nilai3);
            break;
            
            default: 
                System.out.println("Kembali");
                
        }
    }
    
}
