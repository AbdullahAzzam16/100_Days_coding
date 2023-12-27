import java.util.*;

public class day81 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1, c;

        System.out.println("Deret Fibonacci dari 1 sampai " + n + " adalah:");
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
