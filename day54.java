import java.util.*;
public class day54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Batas Angka :");
        int batas = sc.nextInt();

        if (batas == 1 || batas == 2) {
            System.out.println("Kosong");
        } else {
            for (int i = 1; i <= batas; i++) {
                if (i % 3 == 0) {
                  System.out.println(i);  
                }
            }
        }
        
    }
}
