import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main2169 {
    StringBuilder sb;

    public static void main(String[] args) {
        new Main2169().run();
    }

    private void run() {
        int n = new Scanner(System.in).nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(i+1);
        }
        sb = new StringBuilder();
        print(a);
        for(;;) {
            int i = a.size()-2;
            while(i>=0 && a.get(i+1)<a.get(i)) i--;
            if (i<0) break;
            int j = a.size()-1;
            while (a.get(i)>a.get(j)) j--;
            Collections.swap(a, i, j);
            Collections.reverse(a.subList(i+1, a.size()));
            print(a);
        }
        System.out.println(sb.toString());
    }

    private void print(List<Integer> a) {
        for (Integer t : a) {
            sb.append(t).append(" ");
        }
        sb.append('\n');
    }
}
