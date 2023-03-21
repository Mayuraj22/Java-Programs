import java.util.*;
public class ternery {
    public static void main(String args[]) {
      int number =  7;

      //ternery operator
      String type= ((number%2)==0)? "even" : "odd";
      System.out.println(type);
    }
}