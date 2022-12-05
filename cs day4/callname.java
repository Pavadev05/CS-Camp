import java.util.Scanner;
public class callname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = 1;
        
        
        while(check ==1){
            System.out.println("Please select hero");
            System.out.println("1:AIRI");
            System.out.println("2:ALEISTER");
            System.out.println("3:ALICE");
            System.out.println("4:ALLAIN");
            System.out.print("Select hero : ");
            int hero = sc.nextInt();
            switch (hero){
                case 1 :
                    System.out.println("------------------");
                    System.out.println("You select AIRI");
                    System.out.println("------------------");
                    System.out.println("");
                    break;
                case 2 :
                    System.out.println("------------------");
                    System.out.println("You select ALEISTER");
                    System.out.println("------------------");
                    System.out.println("");
                    break;
                case 3 :
                    System.out.println("------------------");
                    System.out.println("You select ALICE");
                    System.out.println("------------------");
                    System.out.println("");
                    break;

                case 4 :
                    System.out.println("------------------");
                    System.out.println("You select ALLAIN");
                    System.out.println("------------------");
                    System.out.println("");
                    break;
                default :
                    System.out.println("------------------");
                    System.out.println("Error pls select again");
                    System.out.println("------------------");
                    System.out.println("");
                    break;
            }

                System.out.print("Continue? (1:y/0:n) : ");
                check = sc.nextInt();
                System.out.println("");
        }
    }
}
