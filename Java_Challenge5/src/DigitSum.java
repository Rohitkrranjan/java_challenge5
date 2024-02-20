import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n = input.nextInt();
        int sum = Sum(n);

        System.out.println(sum);

    }

    public static int Sum(int num){

        int sum =0;
       while(num > 0)
       {
           int digit = num % 10;
           sum = sum+digit;
           num /=10;
       }
       return sum;
    }
}
