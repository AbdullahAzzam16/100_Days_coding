import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        System.out.print("Pilih operasi (+ untuk penjumlahan, - untuk pengurangan): ");
        char operasi = scanner.next().charAt(0);

        double hasil = 0;

        switch (operasi) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil pengurangan: " + hasil);
                break;
            default:
                System.out.println("Operasi tidak valid");
        }

        scanner.close();
    }
}
