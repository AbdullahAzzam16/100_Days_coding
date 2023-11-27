import java.util.*;

public class day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sisi 1 :");
        int Sisi1 = sc.nextInt();

        System.out.print("Sisi 2 :");
        int Sisi2 = sc.nextInt();

        int keliling = Sisi1 * 4 ;
        System.out.println("Keliling :"+ keliling );

        int luas = Sisi1 * Sisi2;
        System.out.println("Luas :"+luas);
    }

}
