import java.util.*;
public class day56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Batas :");
        int batas = sc.nextInt();

        for (int i = 1; i <= batas; i++) {
            for (int j = 0; j < i; j++) {
                 System.out.print(i +" ");
            } 
            System.out.println();        
        }
    }
}
