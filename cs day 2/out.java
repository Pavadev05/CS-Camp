import java.util.Scanner;
public class out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score");
        double score = sc.nextDouble();
            
            // if(score > 100){
            //     System.out.println("How?");
            // }
            if(score >= 80){
                System.out.println("Grade A");
            }
            else if(score >= 70){
                System.out.println("Grade B");
            }
            else if(score >= 60){
                System.out.println("Grade C");
            }
            else if(score >= 50){
                System.out.println("Grade D");
            }
            else if(score < 50){
                System.out.println("Grade F");
            }
            // else if(score >= 0){
            //     System.out.println("Pls take your book and read it");
            // }
            else{
                System.out.println("error");
            }
    }
}