//p = 17 , hargatiket = 50000, diskon 10% untuk pembelian 6-9 tiket, diskon 16% untuk pembelian > 9 tiket


import java.util.Scanner;
public class totalPenjualanTiket17 {
    public static void main(String[] args){
        Scanner Jonatan = new Scanner (System.in);

        int hargaTiket = 50000, totalTiket = 0, transaksi = 0 , jumlahTiket;
        double totalPenjualan = 0,diskon,subtotal;

       while (true) {
            System.out.print("Jumlah tiket (0 untuk selesai): ");
            jumlahTiket = Jonatan.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid");
                System.out.println("Silakan input ulang.");
                continue;
            }
            subtotal = jumlahTiket * hargaTiket;

            if (jumlahTiket > 9) {
                diskon = 0.16;
            } else if (jumlahTiket > 5) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            double potongan = subtotal * diskon;
            double totalBayar = subtotal - potongan;

            System.out.println("Subtotal: Rp" + subtotal);
            System.out.println("Diskon: Rp" + potongan);
            System.out.println("Total bayar: Rp" + totalBayar);

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;
            transaksi++;
        }
        System.out.println("Jumlah transaksi: " + transaksi);
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalPenjualan);

    }
}

