import java.util.Scanner;

public class TinggiBadanBranching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tinggi badan Anda (cm): ");
        double tinggiBadan = scanner.nextDouble();

        String kategori;
        if (tinggiBadan < 140) {
            kategori = "Bogel";
        } else if (tinggiBadan >= 140 && tinggiBadan < 150) {
            kategori = "Pendek";
        } else if (tinggiBadan >= 150 && tinggiBadan < 160) {
            kategori = "Normal";
        } else if (tinggiBadan >= 160 && tinggiBadan < 170) {
            kategori = "Tinggi";
        } else {
            kategori = "Lumayan Tinggi";
        }

        System.out.println("Kategori tinggi badan Anda adalah: " + kategori);
    }
}
