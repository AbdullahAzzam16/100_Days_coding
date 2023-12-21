import java.util.*;
public class day73 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        while(true){
        System.out.print("Angka: ");
         int angka = in.nextInt();
            
            if(angka%2==0){
                System.out.println("genap");
            }else {
                System.out.println("Ganjil");
                break;
            }
            
        }
    }
}