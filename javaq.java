import java.util.*;
public class javaq{
   public static void main(String args[]) {
   Scanner sc= new scanner(System.in);
   
   
   do{
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    if(n % 10 == 0){
        break;
    }
    System.out.println(n);
   }while(true);
}
}

