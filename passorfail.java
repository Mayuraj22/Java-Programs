import java.util.*;
public class passorfail {
    public static void main(String args[]) {
        /*int n=67;

        if(n<=33)
        {
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }*/

        //or by using ternery operator

        int marks=32;

        String reportcard=marks>=33?"pass" : "fail";

        System.out.println(reportcard);
    }
}
