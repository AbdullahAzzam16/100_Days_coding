import java.util.*;
public class day53 {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Nama :");
    String nama = s.nextLine();
    System.out.print("NIM  :");
    String nim = s.nextLine();
    System.out.print("Tinggi Badan :");
    int tb = s.nextInt();
    System.out.print("Berat Badan :");
    double bb = s.nextInt();
    System.out.print("Size Baju :");
    char baju = s.next().charAt(0);
    System.out.print("Status Pernikahan :");
    boolean status = s.nextBoolean();
    System.out.print("Agama :");
    String agama = s.next();
   } 
}
