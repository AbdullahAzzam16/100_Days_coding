import java.util.*;

public class day80 {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Jumlah angka prima dari 1 sampai " + n + " adalah " + count);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
