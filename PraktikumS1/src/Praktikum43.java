
import java.util.Scanner;
public class Praktikum43 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String bulan;
        
        System.out.print("Masukkan nama bulan Hijriyah: ");
        bulan = input.nextLine();
        
        switch(bulan){
            case "Muharram":
            case "Rabiul Awal":
            case "Jumadil Awal":
            case "Rajab":
            case "Zulkaidah":
                System.out.println("Jumlah hari pada bulan " + bulan + " adalah 29 hari");
            break;
            
            case "Safar":
            case "Rabiul Akhir":
            case "Jumadil AKhir":
            case "Syaban":
            case "Ramadhan":
            case "Syawal":
                System.out.println("Jumlah hari pada bulan " + bulan + " adalah 30 hari");
            break;
            case "Zulhijjah":
                System.out.println("Jumlah hari pada bulan " + bulan + " adalah 29/30 hari");
            default:
                System.out.println("Inputan tidak sesuai");
        }
    }
    
}
