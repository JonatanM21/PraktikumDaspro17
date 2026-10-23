//p=17, hargaKopi=12.000 , hargaTeh = 6.000, haragRoti = 20000;
import java.util.Scanner;
public class kafeDoWhile17 {
    public static void main(String[] args){
        Scanner Jonatan = new Scanner (System.in);
        
        int kopi, teh, roti , totalHarga;
        int hargaKopi = 12000,hargaTeh = 6000,hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (Ketik 'batal' untuk keluar) : ");
            namaPelanggan = Jonatan.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi:");
            kopi = Jonatan.nextInt();
            System.out.print("Jumlah Teh:");        
            teh = Jonatan.nextInt();
            System.out.print("Jumlah Roti:");
            roti = Jonatan.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total Harga: Rp " + totalHarga);
            Jonatan.nextLine(); 
        } while (true);

        System.out.println("Semua transaksi selesai.");
        
    }     
}