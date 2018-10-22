import java.io.*;
import java.util.Arrays;

public class Main112 {

    public static void main(String[] args) {
        new Main112().run();
    }

    private void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.printf("%4.2f\n",
                    1 /
                            Arrays.stream(reader.readLine().split(" "))
                                    .mapToDouble(Double::parseDouble)
                                    .map(x -> 1.0 / x)
                                    .sum()
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}