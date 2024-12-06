public class FrekuensiArray {
public static void main(String[] args) {
      
        int[] array = {1, 2, 2, 3, 3, 3, 4};
    
      
        hitungFrekuensi(array);
    }

    public static void hitungFrekuensi(int[] array) {
    
        boolean[] sudahDihitung = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (sudahDihitung[i]) {
                continue;
            }

            int count = 1; //
        }
    }
}