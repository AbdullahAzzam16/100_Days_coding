import java.util.*;

public class day98{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hari: ");
        String hari = scanner.nextLine().toLowerCase(); // Mengonversi input ke huruf kecil

        switch (hari) {
            case "senin":
                System.out.println("Hari ini adalah hari senin");
                break;
            case "selasa":
                System.out.println("Hari ini adalah hari selasa");
                break;
            case "rabu":
                System.out.println("Hari ini adalah hari rabu");
                break;
            default:
                System.out.println("Hari ini adalah hari lain");
        }
    }
}