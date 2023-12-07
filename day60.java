import java.util.*;
public class day60 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Berat Badan :");
    double berat = sc.nextDouble();
    System.out.print("Tinggi Badan :");
    double tinggi = sc.nextDouble();
    double m;
    m = tinggi / 100;
    double imt;
    imt = berat /(m *m);

    if (imt >= 30) {
        System.out.println("Obesitas");
    }else if (imt > 25 && imt < 30) {
        System.out.println("Berat Badan Berlebih");
    }else if (imt > 18 && imt < 25) {
        System.out.println("Berat Badan Normal");
    } else if (imt < 18) {
        System.out.println("Berat Badan dibawah Normal");
    }else{
        
    }
   } 
}
