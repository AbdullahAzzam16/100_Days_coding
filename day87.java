import java.util.*;

public class day87 {

    public static void main(String[] args) {
        int n = 5;
        int[] data = new int[n];

        Scanner sc = new Scanner(System.in); 

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt(); 
        }
        System.out.println();
        Arrays.sort(data); 

        System.out.println("Data setelah diurutkan:");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }

        sc.close(); 
    }
}