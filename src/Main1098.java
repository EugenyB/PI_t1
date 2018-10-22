import java.util.Scanner;

public class Main1098 {

    int N = 8;
    int M = 92;

    int x[][] = new int[M][N+1];
    int t[] = new int[N+1];
    int count = 0;
    boolean hor[] = new boolean[N+1];
    boolean d1[] = new boolean[2*N-1];
    boolean d2[] = new boolean[2*N-1];

    public static void main(String[] args) {
        new Main1098().run();
    }

    private void run() {
        for (int i=1;i<=N;i++) hor[i] = true;
        for (int i=0;i<2*N-1;i++) {
            d1[i] = true;
            d2[i] = true;
        }
        find(1);
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int p[] = new int[N+1];
        while (t-->0) {
            for (int i=1; i<=N; i++) {
                p[i] = in.nextInt();
            }
            System.out.print(process(p));
        }
        System.out.println();
    }

    boolean check(int i, int k) {
        return hor[k] && d1[i-k+N-1] && d2[i+k-2];
    }

    void put(int i, int k) {
        hor[k] = false;
        d1[i-k+N-1] = false;
        d2[i+k-2] = false;
        t[i] = k;
    }

    void del(int i, int k) {
        hor[k] = true;
        d1[i-k+N-1] = true;
        d2[i+k-2] = true;
    }

    void rec() {
        for (int i=1; i<=N; i++) {
            x[count][i] = t[i];
        }
        count++;
    }

    void find(int i) { // установка ферзя с номером i
        for (int k = 1; k <= N; ++k) {
            if (check(i,k)) {
                put(i,k);
                if (i==N) {
                    rec();
                } else {
                    find(i+1);
                }
                del(i,k);
            }
        }
    }

    int process(int p[]) {
        int min = 8;
        for (int i=0; i<count; i++) {
            int z = 0;
            for (int j=1; j<=N; j++) {
                if (x[i][j] != p[j]) {
                    z++;
                }
            }
            if (z<min) min = z;
        }
        return min;
    }

}
