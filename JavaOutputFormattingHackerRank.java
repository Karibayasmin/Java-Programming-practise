import java.util.Scanner;

public class JavaOutputFormattingHackerRank {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1,x);
/*Here %-15s denotes the string's minimum field width 15. %03d denotes integer's minimum field width 3. %n denotes new line. If still confusion see this link https://www.baeldung.com/java-printstream-printf */
            }
            System.out.println("================================");

    }
}

Java Output Formatting


