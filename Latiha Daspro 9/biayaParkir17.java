//p = 17 , biaya parkir mobil =3.750/jam, biaya parkir motor = 2750/jam

import java.util.Scanner;

public class biayaParkir17 {
    public static void main(String[] args) {
    Scanner Jonatan = new Scanner(System.in);

    int total = 0;

    while (true) {

        System.out.print("Input Jenis kendaraan (1. Mobil, 2. Motor, 3. Bus, 0. Keluar): ");
        int jenis = Jonatan.nextInt();
    
        if (jenis == 0) {
            break;
        }
        if (jenis == 1 || jenis == 2) {
            System.out.print("Input durasi parkir (jam): ");
            int durasi = Jonatan.nextInt();
            
            if(jenis == 1){
                total = durasi * 3750;
            } else if (jenis == 2){
                total = durasi * 2750;
            }
        }
        System.out.println("Total biaya parkir: " + total);
    }
}
}