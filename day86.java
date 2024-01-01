public class day86 {
    public static void main(String[] args) {
        String [][] buah = {
            {"1", "Jeruk"},
            {"2", "Apel"},
            {"3", "Durian"},
        };
        String[] a = buah[1];
        for (int i = 0; i < buah.length; i++) {
            for (int j = 0; j < buah[i].length; j++) {
                if (i % 2 == 1) {
                    System.out.print(buah[i][j] + " ");
                }
            }
            System.out.println();
        }
        
    }    
}
