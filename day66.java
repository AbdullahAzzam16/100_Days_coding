import java.util.*;
public class day66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] hari = new String[8];

        for (int i = 1; i < hari.length; i++) {
            System.out.print("Ini hari "+i +": ");
            hari[i] = sc.nextLine();
        }
        System.out.println("Selesai");
    }
    
}