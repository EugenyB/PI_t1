import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main31 {

    public static void main(String[] args) {
        new Main31().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int calcp = 0;
        for (int i = 0; i < k; i++) {
            int start = in.nextInt();
            int finish = in.nextInt();
            for (int y = start; y <=finish ; y++) {
                for (int m = 1; m <=12 ; m++) {
                    if(LocalDate.of(y, m, 13).getDayOfWeek().equals(DayOfWeek.FRIDAY)){
                        calcp++;
                    }
                }
            }
        }
        System.out.println(calcp);

    }
}