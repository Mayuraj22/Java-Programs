import java.util.*;
public class largestofthree{
    public static void main(String arg[]) {
        int A=1, B=3 ,C=6;

        if((A>=B)&& (A>=C))
        {
            System.out.println("Largest is A");
        }
        else if(B>=C){
            System.out.println("Largest is B");
        }
        else{
            System.out.println("Largest is C");
        }
    }
}
