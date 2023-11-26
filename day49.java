import java.util.Scanner;

public class Segitiga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Alas segitiga: ");
        int alas = scanner.nextInt();

        System.out.print("Tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        double luas = alas * tinggi / 2;

        double keliling = alas + tinggi + (Math.sqrt(alas * alas + tinggi * tinggi));

        System.out.println("Luas segitiga = " + luas);
        System.out.println("Keliling segitiga = " + keliling);
    }
}
