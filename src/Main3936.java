import java.util.Scanner;

public class Main3936 {
    public static void main(String[] args) {
        new Main3936().run();
    }

    private void run() {
        int n = new Scanner(System.in).nextInt();
        p(n,1,2,3);
    }

    void p(int n, int a, int b, int c) {
        if (n==1) {
            System.out.println(a + " " + b);
        } else {
            p(n-1,a,c,b);
            p(1,a,b,c);
            p(n-1,c,b,a);
        }
    }
}
