import java.util.*;
public class day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] buah = new String[5];

        for (int i = 1; i < buah.length; i++) {
            System.out.print("Buah ke "+ i +":");
            buah[i] = sc.nextLine();
        }
        for (String a : buah) {
            System.out.println(a);
        }
    }
}
