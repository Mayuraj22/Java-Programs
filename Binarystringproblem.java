import java.util.*;
public class Binarystringproblem {
   public static int printBinstrings(int n,int lastplace,StringBuilder str){

    //kaam
    if(lastplace==0){
   printBinstrings(n-1,0,str.append("0"));
   printBinstrings(n-1,1,str.append("1"));
   }else{
    printBinstrings(n-1,0,str.append("0"));
   }
   }


}

public static void main(String[] args) {
    
}