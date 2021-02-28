// Practical No. 5
import java.util.Scanner;

public class BinaryDecimalAndDecimalToBinary {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Select One Option:");
        System.out.println("Press 1 for Binary to Decimal.:");
        System.out.println("Press 2 for Decimal to Binary:");
        int option = s.nextInt();
        if(option == 1){
            System.out.println("Enter a Binary value: ");
            long num = s.nextLong();
            int decimal = convertBinaryToDecimal(num);
            System.out.printf("%d in binary = %d in decimal", num, decimal);
        }
        else if(option == 2){
            System.out.println("Enter a Decimal number: ");
            int num = s.nextInt();
            long binary = convertDecimalToBinary(num);
            System.out.printf("%d in decimal = %d in binary", num, binary); 
        }
        else{
            System.out.println("Wrong Input! Try Again!");
        }
    }

    public static int convertBinaryToDecimal(long num)
    {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0)
        {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }

    public static long convertDecimalToBinary(int n)
    {
        long binaryNumber = 0;
        int remainder, i = 1, step = 1;

        while (n!=0)
        {
            remainder = n % 2;
            System.out.printf("Step %d: %d/2, Remainder = %d, Quotient = %d\n", step++, n, remainder, n/2);
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
}