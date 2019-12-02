import java.util.Scanner;
public class JavaLoopsIIHackerRank {
    public static void main(String args[]) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter Sample input: ");
        int sampleInput = sc.nextInt();

      for(int i = 1; i <= sampleInput; i++){  
          //System.out.print("Enter "+ i +" number input of a, b, n: ");  
          int a = sc.nextInt();
          int b = sc.nextInt();
          int n = sc.nextInt();
          
          for(int j = 0; j < n; j++){
              int r = (a+((int)Math.pow(2,j))*b);
              r = r + x;
              System.out.print(r+" ");
              x = r - a;   

          }
          System.out.println();
          x = 0;    
      }
    }
}

