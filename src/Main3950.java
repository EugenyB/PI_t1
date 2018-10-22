
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main3950 {
    public static void main(String[] args) {
        new Main3950().run();
    }

    private void run() {
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n+1];
        a[0] = 1;
        while (a[n]==0) {
            print(a);
            plus1(a);
        }
    }

    private void plus1(int[] a) {
        int i = 0;
        while (a[i]==1) {
            a[i] = 0;
            i++;
        }
        a[i]=1;
    }

    private void print(int[] a) {
        System.out.print(IntStream.of(a).sum());
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i]==1){
                System.out.print(" "+(i+1));
            }
        }
        System.out.println();
    }


}
