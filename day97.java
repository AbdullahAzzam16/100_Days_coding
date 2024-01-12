import java.util.*;

public class day97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angkaAwal = scanner.nextInt();

        System.out.print("Masukkan angka akhir: ");
        int angkaAkhir = scanner.nextInt();

        if (angkaAwal > angkaAkhir) {
            System.out.println("Angka awal tidak boleh lebih besar dari angka akhir!");
            System.exit(0);
        }

        StringBuilder hasil = new StringBuilder();

        for (int i = angkaAwal; i <= angkaAkhir; i++) {
            if (i % 3 == 0) {
                hasil.append(i).append("\n");
            }
        }

        System.out.println("Angka yang habis di bagi 3 : " + hasil);
    }
}