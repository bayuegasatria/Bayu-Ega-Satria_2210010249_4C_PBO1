
package uas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Proses[] menu = new Proses[2];
        String item = null,diskon;
        double harga = 0;
        try {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Selamat Datang");
            System.out.print("Masukan Nama Anda   : ");
            String nama = input.next();
            System.out.println("Pilih Layanan Dibawah :");
            System.out.println("1. Reguler      Rp.100000");
            System.out.println("2. Premium      Rp.250000");
            System.out.println("3. VVIP         Rp.500000");
            System.out.print("Masukan Pilihan :");
            int a =input.nextInt();
            
            switch (a) {
                case 1 :
                    item ="Reguler";
                    harga =100000;
                break;
                
                case 2 :
                    item ="Premium";
                    harga =250000;
                break;
                
                case 3 : 
                    item ="VVIP";
                    harga =500000;
                break;
                default :
                    System.out.println("pilihan tidak valid  ");
            }
            
            System.out.print("Masukan Kode Bonus  (a/b)  : ");
            String kode = input.next();
            System.out.println("Pilih Diskon          : ");
            System.out.println("1. 10%");
            System.out.println("2. 20%");
            System.out.print("Masukan pilihan :");
            int b = input.nextInt();
            
            switch (b){
                case 1 : diskon = "10%";
                break;
                case 2 : diskon = "20%";
                break; 
                default : diskon = null;
                break;    
            }
        menu[i] = new Proses (diskon,nama,item,kode,harga);    
        }
        
        for (Proses data : menu){
            System.out.println("####################################");
            data.display();
        }
        } catch (Exception e) {
            System.out.println("Ada Kesalahan : " +e.getMessage());
        }
    }
 
}
