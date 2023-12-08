import java.util.*;
public class day61 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Batas Angka :");
    int batas = sc.nextInt();

    for (int i = 1; i < batas; i++) {
        if (i % 3 == 0 && i % 4 == 0) {
            System.out.println(i);
        }
    }
   } 
}
