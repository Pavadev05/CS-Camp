import java.util.Scanner;
public class labagain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            int t;
            t = n / 10;
            if (n % 10 == 0) {
                System.out.println(  t + "ten coin");
                n = n - (t * 10);
            } else if (n >= 5) {
                int f;
                f = n / 5;
                if (n % 5 == 0) {
                    System.out.println( f + "five coin");
                    n = n - (f * 5);
                } else if (n >= 5) {
                    int o;
                    o = n / 1;
                    if (n % 1 == 0) {
                        System.out.println( o + "one coin");
                        n = n - (o * 1);
                    } else {
                        System.out.println("Error");
                    }
                }
            }
        }
    }
}