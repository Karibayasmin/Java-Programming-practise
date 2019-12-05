import java.util.Scanner;
public class Java2DArrayHackerRank {
    public static void main(String args[]) {       
        int sum = 0; 
        Scanner sc = new Scanner(System.in);
      int a[][] = new int[6][6];  
      for(int i = 0; i < 6; i++){     
         // System.out.println("Enter "+ i +" Number row value: ");    
          for(int j = 0; j < 6; j++){       
              a[i][j] = sc.nextInt();      
          }   
         // System.out.println();
      }
      int maxsum = Integer.MIN_VALUE;
      for(int col = 0; col < 4; col++){     
        //  System.out.println("Show "+ col +" Number row value: ");  
          for(int row = 0; row < 4; row++){    
               sum = a[col][row]
                        +a[col][row+1]
                        +a[col][row+2]
                        +a[col+1][row+1]
                        +a[col+2][row]
                        +a[col+2][row+1]
                        +a[col+2][row+2];    
                       // System.out.println(a[col][row]+"+"+a[col][row+1]+"+"+a[col][row+2]+"+"+a[col+1][row+1]+"+"+a[col+2][row]+"+"+a[col+2][row+1]+"+"+a[col+2][row+2]);
                                         
              if(sum > maxsum){                  
                  maxsum = sum;
                 // System.out.println(maxsum+" = "+a[col][row]+"+"+a[col][row+1]+"+"+a[col][row+2]+"+"+a[col+1][row+1]+"+"+a[col+2][row]+"+"+a[col+2][row+1]+"+"+a[col+2][row+2]);                 
              }
          }          
          // System.out.println();
      }      
      System.out.println(maxsum);      
    }
}

