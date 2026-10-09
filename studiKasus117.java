import java.util.Scanner;

public class studiKasus117 {
    public static void main(String[] args) {
        Scanner Jonatan = new Scanner(System.in);

        int hargaPerCup = 20000, jumlahCup,uangBayar,totalHarga ;
        double diskon,totalBayar,kembalian,kurang;

        System.out.print("Masukkan Jumlah Cup:");
        jumlahCup = Jonatan.nextInt();

        System.out.print("Masukkan Uang Bayar:");
        uangBayar = Jonatan.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
   
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }else {
            diskon = 0;
        }

         totalBayar = totalHarga - diskon;

         System.out.println("Total Harga  :" + totalHarga);
         System.out.println("Diskon:" + diskon);
         System.out.println("Total Bayar:" + totalBayar);

         if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian:" + kembalian);
         } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang Tidak Cukup,Kurang Rp:" + kurang);
         }


    }
    
}