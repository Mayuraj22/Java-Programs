import java.util.*;

public class floydstriangle {
    public static void floydstriangle(int n) {
        int counter=1; 
        //outer loop
        for(int i=1; i<=n ;i++){
            //for counter value
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
        
     floydstriangle(5);
}
}
