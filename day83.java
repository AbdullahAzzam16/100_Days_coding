import java.util.*;

public class day83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai angka (0-100): ");
        int nilai = sc.nextInt();

        if (nilai >= 90) {
            System.out.println("Nilai huruf: A");
        } else if (nilai >= 80) {
            System.out.println("Nilai huruf: B");
        } else if (nilai >= 70) {
            System.out.println("Nilai huruf: C");
        } else if (nilai >= 60) {
            System.out.println("Nilai huruf: D");
        } else {
            System.out.println("Nilai huruf: E");
        }
    }
}
