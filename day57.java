import java.util.*;

public class day57 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Batas Angka :");
        int batas = s.nextInt();

        for (int i = batas; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
