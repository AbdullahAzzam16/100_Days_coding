import java.util.*;

public class day78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai ujian anda ? ");
        int nilaiUjian = scanner.nextInt();

        if (nilaiUjian < 60) {
            System.out.println("Anda belum lulus, perlu belajar lebih giat lagi.");
        } else if (nilaiUjian >= 60 && nilaiUjian < 80) {
            System.out.println("Anda lulus dengan nilai cukup baik.");
        } else {
            System.out.println("Selamat! Anda lulus dengan nilai sangat baik.");
        }
    }
}
