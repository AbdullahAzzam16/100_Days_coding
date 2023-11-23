import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari user
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.print("Masukkan operasi aritmatika (+, -, *, /): ");
        char operasi = input.next().charAt(0);

        // Melakukan operasi aritmatika berdasarkan inputan
        double hasil;
        switch (operasi) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operasi aritmatika tidak valid");
                return;
        }

        // Menampilkan hasil operasi aritmatika
        System.out.printf("Hasil dari %.2f %c %.2f = %.2f", angka1, operasi, angka2, hasil);
    }
}