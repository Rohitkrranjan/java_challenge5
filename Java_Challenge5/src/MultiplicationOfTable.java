import java.sql.SQLOutput;
import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int x = input.nextInt();

        printMultiplication(x);

    }

    public static void  printMultiplication(int num)
    {
        int i=1;
        while(i <= 10)
        {
            System.out.println(num + " * " + i + " = " + (num*i));
            i++;
        }

    }
}