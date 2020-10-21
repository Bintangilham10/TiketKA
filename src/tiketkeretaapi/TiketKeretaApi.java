
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class TiketKeretaApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        inisialisasi java scanner
        Scanner input = new Scanner(System.in);
//        menu tiket kereta api
        System.out.println("_____________________STASIUN K.A____________________");
        System.out.println("MENU TIKET KERETA API : ");
        System.out.println("____________________________________________________");
        System.out.println("No Tujuan            Harga");
        System.out.println("1. Malang           Rp 75000");
        System.out.println("2. Banyuwangi       Rp 50000");
        System.out.println("3. Bandung          Rp 65000");
        System.out.println("4. Jakarta          Rp 100000");
        System.out.println("5. Yogyakarta       Rp 60000");

//        inisialisasi pembayaran awal
        int harga = 0;

//        inisialisasi harga kelima menu
        int h1 = 75000, h2 = 50000, h3 = 65000, h4 = 100000, h5 = 60000;
        String menu;
        
        System.out.println("___________________________________________________________________");
//        pengguna memasukkan nomor pesanan
        System.out.print("Masukkan Nomor Pesanan : ");
        int inNomor = input.nextInt();
        System.out.println("___________________________________________________________________");

        if (inNomor == 1)
        {
//      fungsi untuk menu pertama
            menu = "Malang";
            System.out.println("Pilihan anda nomor "+ inNomor+"."+ menu);
            harga = h1;
            
        System.out.println("_____________________________________________________");
        System.out.println("Total pembayaran sebesar Rp."+ harga);
        System.out.println("Terimakasih atas kunjungannya.");
            
        }
            else if (inNomor == 2)
            {
//          fungsi untuk menu kedua
                menu = "Banyuwangi";
                System.out.println("Pilihan anda nomor " + inNomor+"."+ menu);
                harga = h2;
                
        System.out.println("_____________________________________________________");
        System.out.println("Total pembayaran sebesar Rp."+ harga);
        System.out.println("Terimakasih atas kunjungannya.");
                
            }
                else if (inNomor == 3)
                {
//             fungsi untuk menu ketiga
                    menu = "Bandung";
                    System.out.println("Pilihan anda nomor " + inNomor+"."+ menu);
                    harga = h3;
                    
        System.out.println("_____________________________________________________");
        System.out.println("Total pembayaran sebesar Rp."+ harga);
        System.out.println("Terimakasih atas kunjungannya.");
                }
     else if (inNomor == 4)
     {
        //fungsi untuk menu keempat
      menu = "Jakarta";
      System.out.println("Pilihan anda nomor " + inNomor+"."+ menu);
      harga = h4;
      
        System.out.println("_____________________________________________________");
        System.out.println("Total pembayaran sebesar Rp."+ harga);
        System.out.println("Terimakasih atas kunjungannya.");
      
      }
       else if (inNomor == 5)
      {
      //fungsi untuk menu kelima
       menu = "Yogyakarta";
       System.out.println("Pilihan anda nomor " + inNomor+"."+ menu);
       harga = h5;
        
        System.out.println("_____________________________________________________");
        System.out.println("Total pembayaran sebesar Rp."+ harga);
        System.out.println("Terimakasih atas kunjungannya.");
      }
   }
}
