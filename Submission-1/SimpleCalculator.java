// Practical No. 9
import java.util.Scanner;
public class SimpleCalculator {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    // nextDouble() reads the next double from the keyboard
    double first = reader.nextDouble();
    double second = reader.nextDouble();
    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = reader.next().charAt(0);
    double result;
    switch (operator) {
      case '+':
        result = first + second;
        break;

      case '-':
        result = first - second;
        break;

      case '*':
        result = first * second;
        break;

      case '/':
        result = first / second;
        break;

      // operator doesn't match any case constant (+, -, *, /)
      default:
        System.out.printf("Error! operator is not correct");
        return;
    }

    System.out.println(first + " " + operator + " " + second + " = " + result);
  }
}