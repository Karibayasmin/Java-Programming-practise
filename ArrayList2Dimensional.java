import java.util.*;
public class ArrayList2Dimensional {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     ArrayList<Integer> arrlist = new ArrayList<Integer>();
     
     for(int j = 0; j < 4; j++){
         
         for(int k = 0; k < 4; k++){
             
         int dvalue = sc.nextInt();
         arrlist.add(k,dvalue);
       //  System.out.println(arrlist);
       //  System.out.println(arrlist.size());
             
         }
         System.out.println(arrlist);
         arrlist.clear();
         
     }
     
   }
    
}
