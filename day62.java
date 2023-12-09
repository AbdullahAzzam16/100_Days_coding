import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Umur anda : ");
        int umur = scanner.nextInt();

        if (umur < 15) {
            System.out.println("Anda masih di bawah umur");
        } else if (umur >= 15 && umur < 20) {
            System.out.println("Anda adalah seorang remaja");
        } else {
            System.out.println("Anda adalah seorang dewasa");
        }
    }
}