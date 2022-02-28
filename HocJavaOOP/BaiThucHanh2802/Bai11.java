public class Bai11 {

    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i <= 200; ++i) {
            for (j = 0; j <= 100; ++j) {
                for (k = 0; k <= 40; ++k) {
                    if (i * 1000 + j * 2000 + k * 5000 == 200000) {
                        System.out.printf("\nCan %d to 100k, va %d to 200k, va %d to 500k", i, j, k);
                    }
                }
            }
        }
    }
}