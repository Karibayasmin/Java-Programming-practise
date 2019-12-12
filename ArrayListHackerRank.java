import java.util.*;
public class ArrayListHackerRank{
    public static void main(String args[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
      ArrayList<Integer> arrlist = new ArrayList<Integer>();
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the number of n: ");
      
      int n = sc.nextInt();
      System.out.print("n = "+ n +"\n");
      for( i = 1; i <= n; i++){
          System.out.print("Enter number of d in "+ i +" number line: ");
          
          int d = sc.nextInt();
          System.out.println("d = "+ d);
   //  ArrayList<Integer> arrlist = new ArrayList<Integer>();
     
             for(j = 0; j < d; j++){
                 
    //     for(int k = 0; k < d; k++){
             System.out.print(i+","+j+"=");
         int dvalue = sc.nextInt();
         arrlist.add(j,dvalue);
       //  System.out.println(arrlist);
       //  System.out.println(arrlist.size());
             
      //   }
         /*System.out.println(arrlist);
         arrlist.clear();*/
         
         
     }
     System.out.println(arrlist);
    // int q = sc.nextInt();
    //  System.out.println(arrlist.contains(q));
     arrlist.clear();
     
      }
     /*System.out.println("Enter q number: ");
      int q = sc.nextInt();
      for(k = 0; k <= q; k++){
          System.out.print("l =");
           l = sc.nextInt();
          System.out.print("m =");
           m = sc.nextInt();
          System.out.println(l+","+m);
          al2.contains(q)
      }*/
      
      
   }
}
/*5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33*/
