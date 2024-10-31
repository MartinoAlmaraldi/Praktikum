import java.util.Scanner;

public class Praktikum34 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int harga, beli, menit, stok, hasil, diskon;
       double potongan, bayar;
       
       System.out.println("======== TOKO BUAH A ========");
       System.out.print("Enter jumlah pembelian: ");
       beli = scan.nextInt();
       System.out.print("Enter menit: ");
       menit = scan.nextInt();
       System.out.println("=============================");
       
       stok = 150 - beli;
       harga = 100000;
       hasil = 100000*beli;
       diskon = menit / 40;
       bayar = diskon * 0.05 * 100000;
       int total = (int) (hasil - bayar);

       
       if (menit > 420){
           System.out.println("Toko telah tutup!");
       }
       else if(menit == 0 || beli == 0){
           System.out.println("ERROR - Inputan invalid!");
       }
       else{
           System.out.println("Jumlah Pembelian: " + beli);
           System.out.println("Stok Tersisa: " + stok);
       }
       
       if(menit >= 40 && menit <= 420){
           System.out.println("Hasil Pembelian: " + total);
       }
       else if(menit < 40 && menit != 0 && beli != 0 ){
           System.out.println("Hasil pembelian: " + harga);
       }
           
       
    }
    
}
