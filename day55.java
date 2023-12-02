import java.util.*;
public class day55 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Batas Angka :");
        int batas = s.nextInt();
        s.close();

        if (batas % 2 == 0) {
            for (int i = 2; i <= batas; i+=2) {
                System.out.println(i);
            }
        } else {
            for (int i = 1; i <=  batas; i+=2) {
                System.out.println(i);
            }
        }
    }
}
