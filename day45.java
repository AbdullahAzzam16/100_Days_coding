import java.util.Scanner;

public class PenghasilanBersih {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan penghasilan per bulan : ");
        double penghasilan = scanner.nextDouble();

        System.out.print("Masukkan jenis pekerjaan : ");
        String jenisPekerjaan = scanner.next();

        double pajak = 0;

        if (penghasilan >= 3000000) {
            pajak = 0.05; 
            if (penghasilan >= 5000000) {
                pajak = 0.10; 
            }
        }

        if (jenisPekerjaan.equalsIgnoreCase("PNS")) {
            pajak += 0.05; 
        }

        double pajakDibayarkan = penghasilan * pajak;
        double penghasilanBersih = penghasilan - pajakDibayarkan;

        System.out.println("Penghasilan Bersih per Bulan: " + penghasilanBersih + " Rupiah");
        System.out.println("Pajak yang Dibayarkan: " + pajakDibayarkan + " Rupiah");

        scanner.close();
    }
}
