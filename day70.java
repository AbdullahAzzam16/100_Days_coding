import java.util.*;
public class day70 {
   public static void main(String[] args) {
    HashMap<Integer, String> hari = new HashMap<Integer, String>();

    hari.put(1, "Senin");
    hari.put(2, "Selasa");
    hari.put(3, "Rabu");
    hari.put(4, "Kamis");
    hari.put(5, "Jumat");
    hari.put(6, "Sabtu");
    hari.put(7, "Minggu");

    System.out.println(hari);
    System.out.print("Hari :"+ hari.get(2));
   } 
}
