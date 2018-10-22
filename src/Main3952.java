import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main3952 {

    StringBuilder sb;

    public static void main(String[] args) {
        new Main3952().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(i < n-k ? 0 : 1);
        }
        sb = new StringBuilder();
        print(a);
        for(;;) {
            int i = a.size()-2;
            while(i>=0 && a.get(i+1)<=a.get(i)) i--;
            if (i<0) break;
            int j = a.size()-1;
            while (a.get(i)>=a.get(j)) j--;
            Collections.swap(a, i, j);
            Collections.reverse(a.subList(i+1, a.size()));
            print(a);
        }
        System.out.println(sb.toString());
    }

    private void print(List<Integer> a) {
        for (Integer t : a) {
            sb.append(t);
        }
        sb.append('\n');
    }
}
