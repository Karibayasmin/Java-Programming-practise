import java.util.Scanner;

public class JavaStdinandStdoutIIHackerRank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

intNext and intDouble know only decimal numbers but for string enter or space is also a string thats why only before nextLine() of string ....hope you get it.

Java Stdin and Stdout II
