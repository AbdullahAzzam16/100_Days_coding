import java.util.Scanner;

public class day52 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        double total_harga = 0;
        double diskon = 0.05;

        double Y = 1999000;
        double V = 3999000;
        double Z = 5999000;
        double A = 1599000;
        double B = 2499000;
        double C = 4999000;
        double S = 1499000;
        double P = 1199000;

        System.out.println("WELCOME TO THE HELL PHONE");
        System.out.println("1. VIVO");
        System.out.println("2. OPPO");
        System.out.println("3. Itel");
        System.out.print("MERK HP       : ");
        int pilihan = x.nextInt();

        if (pilihan == 1) {
            System.out.println("1. VIVO Y    - Rp1.999.000");
            System.out.println("2. VIVO V    - Rp3.999.000");
            System.out.println("3. VIVO Z    - Rp5.999.000");
            System.out.print("Masukkan Type : ");
            int type = x.nextInt();
            x.nextLine();
            System.out.print("Punya Kartu Member (Ya/Tidak)? : ");
            String kartu = x.nextLine();

            if (kartu.equalsIgnoreCase("Ya")) {
                System.out.println("Mendapatkan Diskon 5%");
                System.out.print("Masukkan Kode Diskon : ");
                String kode1 = x.nextLine();

                if (kode1.equals("DISKONDESEMBER") || kode1.equals("DISKONNATAL")) {
                    System.out.println("Berhasil Mendapatkan Diskon 5%");
                    if (type == 1) {
                        total_harga = Y - (Y * diskon);
                    } else if (type == 2) {
                        total_harga = V - (V * diskon);
                    } else if (type == 3) {
                        total_harga = Z - (Z * diskon);
                    } else {
                        System.out.println("PILIHAN TIDAK TERSEDIA !");
                    }
                } else {
                    System.out.println("KODE DISKON SALAH !");
                }
            } else if (kartu.equalsIgnoreCase("Tidak")) {
                if (type == 1) {
                    total_harga = Y;
                } else if (type == 2) {
                    total_harga = V;
                } else if (type == 3) {
                    total_harga = Z;
                } else {
                    System.out.println("PILIHAN TIDAK TERSEDIA !");
                }
            } else {
                System.out.println("MOHON MASUKKAN PILIHAN YANG BENAR");
            }

        } else if (pilihan == 2) {
            System.out.println("1. OPPO A    - Rp1.599.000");
            System.out.println("2. OPPO B    - Rp2.499.000");
            System.out.println("3. OPPO C    - Rp4.999.000");
            System.out.print("Masukkan Type : ");
            int type = x.nextInt();
            x.nextLine();
            System.out.print("Punya Kartu Member (Ya/Tidak)? : ");
            String kartu = x.nextLine();

            if (kartu.equalsIgnoreCase("Ya")) {
                System.out.println("Mendapatkan Diskon 5%");
                System.out.print("Masukkan Kode Diskon : ");
                String kode1 = x.nextLine();

                if (kode1.equals("DISKONDESEMBER") || kode1.equals("DISKONNATAL")) {
                    System.out.println("Berhasil Mendapatkan Diskon 5%");
                    if (type == 1) {
                        total_harga = A - (A * diskon);
                    } else if (type == 2) {
                        total_harga = B - (B * diskon);
                    } else if (type == 3) {
                        total_harga = C - (C * diskon);
                    } else {
                        System.out.println("PILIHAN TIDAK TERSEDIA !");
                    }
                } else {
                    System.out.println("KODE DISKON SALAH !");
                }
            } else if (kartu.equalsIgnoreCase("Tidak")) {
                if (type == 1) {
                    total_harga = A;
                } else if (type == 2) {
                    total_harga = B;
                } else if (type == 3) {
                    total_harga = C;
                } else {
                    System.out.println("PILIHAN TIDAK TERSEDIA !");
                }
            } else {
                System.out.println("MOHON MASUKKAN PILIHAN YANG BENAR");
            }

        } else if (pilihan == 3) {
            System.out.println("1. Itel S23        - Rp1.499.000");
            System.out.println("2. Itel P40    - Rp1.199.000");
            System.out.print("Masukkan Type : ");
            int type = x.nextInt();
            x.nextLine();
            System.out.print("Punya Kartu Member (Ya/Tidak)? : ");
            String kartu = x.nextLine();

            if (kartu.equalsIgnoreCase("Ya")) {
                System.out.println("Mendapatkan Diskon 5%");
                System.out.print("Masukkan Kode Diskon : ");
                String kode1 = x.nextLine();

                if (kode1.equals("DISKONNOVEMBER") || kode1.equals("DISKONBARU")) {
                    System.out.println("Berhasil Mendapatkan Diskon 5%");
                    if (type == 1) {
                        total_harga = S - (S * diskon);
                    } else if (type == 2) {
                        total_harga = P - (P * diskon);
                    } else {
                        System.out.println("PILIHAN TIDAK TERSEDIA, MOHON PILIH SESUAI KETERSEDIAAN");
                    }
                } else {
                    System.out.println("KODE DISKON SALAH !");
                }
            } else if (kartu.equalsIgnoreCase("Tidak")) {
                if (type == 1) {
                    total_harga = S;
                } else if (type == 2) {
                    total_harga = P;
                } else {
                    System.out.println("PILIHAN TIDAK TERSEDIA, MOHON PILIH SESUAI KETERSEDIAAN");
                }
            } else {
                System.out.println("MOHON MASUKKAN PILIHAN YANG BENAR");
            }
        } else {
            System.out.println("PILIHAN TIDAK TERSEDIA !");
        }

        System.out.println("Total Harga Rp" + total_harga);
    }
}
