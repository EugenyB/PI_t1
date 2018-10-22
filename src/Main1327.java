import java.math.BigInteger;
import java.util.Scanner;

public class Main1327 {
    public static void main(String[] args) {
        new Main1327().run();
    }

    private void run() {
        int n = new Scanner(System.in).nextInt();
        System.out.println(f(n));
    }

    private BigInteger f(int n) {
        if (n<2) return BigInteger.ONE;
        BigInteger res = BigInteger.ONE;
        for (long i = 2; i <=n ; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
