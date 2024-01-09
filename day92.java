import java.util.Scanner;

public class day92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Angka awal : ");
        int A = scanner.nextInt();

        System.out.print("Angka akhir : ");
        int B = scanner.nextInt();

        int jumlah = 0;

        for (int i = A; i <= B; i++) {
            jumlah += i;
        }

        System.out.println("Penjumlahan dari " + A + " hingga " + B + " = " + getRangeString(A, B) + " = " + jumlah);
    }

    private static String getRangeString(int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(i);
            if (i < end) {
                result.append('+');
            }
        }
        return result.toString();
    }
}
