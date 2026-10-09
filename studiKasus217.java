import java.util.Scanner;

public class studiKasus217 {
    public static void main(String[] args) {
          Scanner Jonatan = new Scanner(System.in);
       
        int dokumen , juara , pendanaan;
        boolean memenuhiSyarat = true;
        String alasan , nama , jenis;
       
        System.out.print("Nama Mahasiswa: ");
        nama = Jonatan.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya):");
        jenis = Jonatan.nextLine();

        if (jenis.equalsIgnoreCase("BELMAWA")
                || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("Mandiri")) {

                     System.out.print("Peringkat juara (1/2/3), isi 0 jika bukan juara):");
                     juara = Jonatan.nextInt(); 

         if (juara >= 1 && juara <= 3) {
            alasan = "Memenuhi syarat peringkat juara " + juara;
            } else {
                alasan = "Hanya untuk peringkat juara 1, 2, atau 3";
            }
        } else if (jenis.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan (1 = lolos, 0 = tidak lolos):");
            pendanaan = Jonatan.nextInt();

        if (pendanaan == 1) {
            alasan = "PKM lolos pendanaan";
            } else {
            alasan = "PKM tidak lolos pendanaan";
            }
        } else {
            alasan = "Jenis kegiatan tidak termasuk ketentuan";
        }

        if (memenuhiSyarat) {
            System.out.print("Jumlah dokumen yang diupload (0-4):");
            dokumen = Jonatan.nextInt();
            if (dokumen == 4) {
                System.out.println("Status: BERHAK memperoleh dana penghargaan");
                System.out.println("Alasan: " + alasan + " dan dokumen lengkap");
            } else {
                System.out.println("Status: DANA PENGHARGAAN TIDAK DIBERIKAN");
                System.out.println("Alasan: Dokumen tidak lengkap"  + "(kurang" + (4 - dokumen));
            }
        } else {
            System.out.println("Status: TIDAK memperoleh dana penghargaan");
            System.out.println("Alasan: " + alasan);
        }

    }
}