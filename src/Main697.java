import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main697 {
    public static void main(String[] args) {
        new Main697().run();
    }

    private void run() {
        new BufferedReader(new InputStreamReader(System.in)).lines()
                .skip(1)
                .mapToDouble(Double::parseDouble)
                .map(x->x/6)
                .mapToObj(x->String.format("%.10f",x))
                .forEach(System.out::println);
    }
}
