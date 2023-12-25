import java.util.*;

public class day79 {
    public static void main(String[] args) {
        int hari = 2;

        System.out.println("Hari ke-" + hari + " adalah " + hariName(hari));
    }

    public static String hariName(int hari) {
        String hariName = "";

        switch (hari) {
            case 1:
                hariName = "Senin";
                break;
            case 2:
                hariName = "Selasa";
                break;
            case 3:
                hariName = "Rabu";
                break;
            case 4:
                hariName = "Kamis";
                break;
            case 5:
                hariName = "Jumat";
                break;
            case 6:
                hariName = "Sabtu";
                break;
            case 7:
                hariName = "Minggu";
                break;
        }

        return hariName;
    }
}
