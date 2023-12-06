import java.util.*;
public class day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Waktu Sekarang :");
        int waktu = sc.nextInt();

        if (waktu >5 && waktu<= 11) {
            System.out.println("Selamat Pagi");
        }else if (waktu > 11 && waktu <= 14) {
            System.out.println("Selamat Siang");
        }else if (waktu > 14 && waktu <= 18) {
            System.out.println("Selamat Sore");
        }else if (waktu > 18 && waktu <= 24 || waktu > 0 && waktu < 5 ) {
            System.out.println("Selamat Malam");
        }else{
            System.out.println();
        }
    }
}
