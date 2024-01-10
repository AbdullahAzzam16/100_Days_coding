import java.util.Scanner;

public class day94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = input("Angka pertama: ", scanner);
        int b = input("Angka kedua: ", scanner);

        int jumlah = a + b;

        System.out.println("Hasil tambah = " + jumlah);
    }

    public static int input(String pesan, Scanner scanner) {
        System.out.print(pesan);
        return scanner.nextInt();
    }
}