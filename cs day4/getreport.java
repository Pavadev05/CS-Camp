public class getreport {
    public static void main(String[] args) {
        
        Double[] debit = {0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9};
        Double[] credit = {0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9};
        double total = 4000.28;
        double Debit = 168.29;
        double Credit = 800.12;
        
        String[] date = {"2020-01-01","2020-01-02","2020-01-03","2020-01-04","2020-01-05","2020-01-06","2020-01-07","2020-01-08"};
        
        String[] title = {"mom","dad","mom","dad","mom","dad","mom","dad"};
        
        System.out.println("|  seq  |    Date    |              Title            |        Debit      |      Credit      |");
        for(int i = 0; i < title.length; i++){
            
            System.out.printf("| %3d   | %10s |     %13s             | %10f        | %10f       |\n" , i+1 , date[i] , title[i] , debit[i] , credit[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("                     | Total : %21.2f | total debit : %6.2f|total credit : %6.2f|" , total, Debit, Credit);
    }
}