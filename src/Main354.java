// Перестановка

import java.util.*;

public class Main354 {

    public static void main(String[] args) {
        new Main354().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i=1; i<=n; i++) {
            set.add(i);
        }
        while (in.hasNextInt()) {
            set.remove(in.nextInt());
        }
        if (set.isEmpty()) System.out.println("0");
        else System.out.println(set.first());
    }
}