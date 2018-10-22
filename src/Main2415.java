import java.util.Scanner;

public class Main2415 {
    public static void main(String[] args) {
        new Main2415().run();
    }

    private void run() {
        try {
            long n = new Scanner(System.in).nextLong();
            System.out.println(f(n));
        } catch (Exception e) {
            System.out.println(63);
        }
    }

    int f(long n) {
        int k = 0;
        while (n % 2 == 0) {
            n /= 2;
            k++;
        }
        return k;
    }
}
