import java.util.*;
public class ArrayList {
    public static void main(String args[]) {
      /* ArrayList<Integer> arrlist = new ArrayList<Integer>();
        int j = 0;*/
      ArrayList<Integer> arrlist = new ArrayList<Integer>();
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the number of n: ");
      
      int n = sc.nextInt();
      
      for(int i = 1; i <= n; i++){
          System.out.print("Enter number of d in "+ i +" number line: ");
          
          int d = sc.nextInt();
          
   //  ArrayList<Integer> arrlist = new ArrayList<Integer>();
     
             for(int j = 0; j <= d; j++){
         
         for(int k = 0; k < d; k++){
             System.out.print(j+","+k+"=");
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
}
/*5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33*/
