import java.util.*;

public class day85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Batas angka: ");
        int batas = sc.nextInt();

        for (int i = 1; i <= batas; i++) {
            for (int j = 1; j <= batas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}