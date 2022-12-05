import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t10 =0;
        int f5 =0;
        int t2 =0;
        int o1 =0;

        while (n >= 10) {
            n -=10 ;
            t10++;
            if(n < 10){
                System.out.println( t10+"tencoin");
            }   
        }
        while (n >= 5) {
            n -=5 ;
            f5++;
            if(n < 5){
                System.out.println( f5+"fivecoin");
            }   
        }
        while (n >= 2) {
            n -=2 ;
            t2++;
            if(n < 2){
                System.out.println( t2+"twocoin");
            }   
        }
        while (n >= 1) {
            n -=1 ;
            o1++;
            if(n < 1){
                System.out.println( o1+"onecoin");
            }   
        }   
    }
}
