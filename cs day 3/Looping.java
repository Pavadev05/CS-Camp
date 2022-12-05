/**
 * Looping
 */
public class Looping {

    public static void main(String[] args) {
        
        for(int i=0;i<=5;i++){
            for(int j=i;j>=0;j--){
                if(j%2 == 1) continue;
                System.out.println("*");  
            } 
            System.out.println();
        }
    }
}