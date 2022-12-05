import java.util.Scanner;
public class BanSryTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter currency : ");
        String currency = sc.nextLine();
        int cntList = 0;
        int check = 1;
        double total = 0;
        double credit = 0.0;
        double debit = 0.0;
        String[] title = new String[1000];
        double[][] amount = new double[1000][1000];
        String[] date = new String[1000];

        while(check == 1){
            System.out.println("Please select category");
            System.out.println("1:income");
            System.out.println("2:outcome");
            System.out.println("3:get report");
            System.out.println("4:get lastest transaction");
            System.out.print("Select category : ");
            int category = sc.nextInt();
            switch (category) {
                case 1 :
                    System.out.print("Please enter title : ");
                    sc.nextLine();
                    title[cntList] = sc.nextLine();
                    System.out.print("Please enter amount : ");
                    amount[cntList][0] = sc.nextDouble();
                    System.out.print("Please enter date(dd/mm/yyyy) : ");
                    sc.nextLine();
                    date[cntList] = sc.nextLine();
                    amount[cntList][1] = 0;
                    total += amount[cntList][0];
                    debit += amount[cntList][0];
                    cntList++;
                    break ;
                case 2 :
                    System.out.print("Please enter title : ");
                    sc.nextLine();
                    title[cntList] = sc.nextLine();
                    System.out.print("Please enter amount : ");
                    amount[cntList][1] = sc.nextDouble();
                    System.out.print("Please enter date(dd/mm/yyyy) : ");
                    sc.nextLine();
                    date[cntList] = sc.nextLine();
                    amount[cntList][0] = 0;
                    total -= amount[cntList][1];
                    credit += amount[cntList][1];
                    cntList++;
                    break ;
                case 3 :
                    getReport(title,amount,date,cntList,total,currency,credit,debit);
                    break ;
                case 4 :
                    lastTransaction(title,amount,date,cntList,total,currency,credit,debit);
                    break ;
                default:
                    System.out.println("Please try again");
                    break ;

            }
            
            System.out.print("Continue? (1:y/0:n) : ");
            check = sc.nextInt();
            
        }
    }
    public static void getReport(String[] title,double[][] amount,String[] date,int cntList,double total,String currency,double credit,double debit){

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("|  seq  |    Date    |              Title            |           Debit            |          Credit          |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < cntList; i++){

            System.out.printf("| %3d   | %10s |     %13s             | %17f     %s | %15f     %s |\n" , i+1 , date[i] , title[i] , amount[i][0] , currency, amount[i][1], currency);
        }


        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|         Total : %7.2f     %s |   total debit : %6.2f   %s |  total credit : %6.2f  %s |\n" , total,currency, debit,currency, credit ,currency);
        if(total < 0){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Your statement is bad ,You are pay to much!!!!");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
        }else if(total == 0){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Your statement is pretty bad ,You don't have any savings");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
        }else{
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Your statement is good ,You have savings");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
        }
    }

    public static void lastTransaction(String[] title,double[][] amount,String[] date,int cntList,double total,String currency,double credit,double debit){
        if (cntList <= 20 ){
            getReport(title,amount,date,cntList,total,currency,credit,debit);
        }
        else {
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("|  seq  |    Date    |              Title            |           Debit            |          Credit          |");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            for(int i = cntList-20; i < cntList; i++){

                System.out.printf("| %3d   | %10s |     %13s             | %17f     %s | %15f     %s |\n" , i+1 , date[i] , title[i] , amount[i][0] , currency, amount[i][1], currency);
            }


            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.printf("|         Total : %7.2f     %s |   total debit : %6.2f   %s |  total credit : %6.2f  %s |\n" , total,currency, debit,currency, credit ,currency);
            
        }
    }
}