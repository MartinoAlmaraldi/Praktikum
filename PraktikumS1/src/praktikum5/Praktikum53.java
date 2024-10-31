package praktikum5;
import java.util.Scanner;
public class Praktikum53 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i;
        int bilangan;
        System.out.println("Masukkan jumlah: ");
        bilangan = input.nextInt();
        
        for(i = 1; i <= bilangan ; i++){
            if(i % 2 == 0){
                if(i % 3 == 0){
                    System.out.println(i + " Adalah kelipatan dua dan tiga");
                } else if (i % 5 == 0){
                    System.out.println(i + " Adalah kelipatan dua dan lima");
                }else{
                    System.out.println(i + " Adalah kelipatan dua");
                }
            }else if(i % 3 == 0){
                if (i % 5 == 0){
                System.out.println(i + " Adalah kelipatan tiga dan lima");
                }else {
                System.out.println(i + " Adalah kelipatan tiga");
                }
             
            }else if(i % 5 == 0){
                System.out.println(i + " Adalah kelipatan lima");
            } else{
                System.out.println(i);
            }
        }
    }
}
