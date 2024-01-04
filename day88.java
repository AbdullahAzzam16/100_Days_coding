import java.util.*;

public class day88 {

    public static void main(String[] args) {
        int jumlahData = 5;
        Integer[] arrayData = new Integer[jumlahData];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            arrayData[i] = sc.nextInt();
        }

        System.out.println();
        Arrays.sort(arrayData, Collections.reverseOrder());

        System.out.println("Data setelah diurutkan:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(arrayData[i] + " ");
        }
        sc.close(); 
    }
}
