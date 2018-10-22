import java.util.Scanner;

public class Main107 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int upBig = n / 100;
        int upSmall = (n - upBig*100) / 20;
        int d = n - upBig*100 - upSmall*20;
        int s = d * 2 + upSmall * 30 + upBig * 100;
        int s1 = (upSmall+1) * 30 + upBig * 100;
        int s2 = (upBig+1)*100;
        System.out.println(Math.min(Math.min(s,s1),s2));
    }
}
