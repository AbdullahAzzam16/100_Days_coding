import java.util.Scanner;

public class Umur {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();

        if (umur <= 10) {
            System.out.println("Kategori umur: Balita");
        } else if (umur <= 19) {
            System.out.println("Kategori umur: Remaja");
        } else if (umur <= 40) {
            System.out.println("Kategori umur: Dewasa muda");
        } else if (umur <= 55) {
            System.out.println("Kategori umur: Dewasa lanjut");
        } else {
            System.out.println("Kategori umur: Lansia");
        }
    }
}
