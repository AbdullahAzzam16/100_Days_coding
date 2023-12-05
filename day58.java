import java.util.*;

public class day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Batas angka: ");
        int batas = sc.nextInt();

        for (int i = 1; i <= batas; i++) {
            int spasi = batas - i;
            for (int j = 0; j < spasi; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
