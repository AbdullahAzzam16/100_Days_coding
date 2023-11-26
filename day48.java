import java.util.Scanner;

public class Lingkaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jari-jari lingkaran: ");
        double r = scanner.nextDouble();

        // Menghitung luas lingkaran
        double luas = Math.PI * r * r;

        // Menghitung keliling lingkaran
        double keliling = 2 * Math.PI * r;

        // Menampilkan hasil
        System.out.println("Luas : " + luas);
        System.out.println("Keliling : " + keliling);
    }
}
