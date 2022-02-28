public class Bai11 {

    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i <= 200; ++i) {
            for (j = 0; j <= 100; ++j) {
                for (k = 0; k <= 40; ++k) {
                    if (i * 10000 + j * 20000 + k * 50000 == 200000) {
                        System.out.printf("\nCan %d to 10k, va %d to 20k, va %d to 50k", i, j, k);
                    }
                }
            }
        }
    }
}