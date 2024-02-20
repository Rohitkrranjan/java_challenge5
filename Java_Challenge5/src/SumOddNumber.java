import java.util.Scanner;

public class SumOddNumber {
    public static void main(String[] args) {
        System.out.print("Please enter a number : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        SumOddNum(x);

    }

    public static void SumOddNum(int num){
        int sum=0;
        int i=0;
        while(i<=num)
        {

            if(i % 2 != 0)
            {
                sum = sum+i;
            }
            i++;
        }
        System.out.println("Sum of odd number is : "+sum);
    }
}
