import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        long fact = FactorialNumber(n);
        System.out.print("Factorial is : "+ fact);

    }


    public static long FactorialNumber(int num){

        if(num < 2)
        {
            return 1;
        }
        long prod = 1;
        int i=2;
        while(i <= num) {
            prod *= i;
            i++;
        }
        return prod;
    }
}
