import java.util.*;
public class largestarray {
    public static void getlargest(int numbers[]) {
        int largest= Integer.MIN_VALUE; //shows -infinity(minimum value)
        
        for(int i=1; i<numbers.length; i++){
            if(largest<numbers[i])
            {
             largest=numbers[i];
            }
        
       
        }
        return largest;
        }
      
    }
    public static void main(String[] args) {
        int numbers[]={1,0,5,6,8};
        System.out.println("largest value is: "+ getlargest(numbers));
    }


