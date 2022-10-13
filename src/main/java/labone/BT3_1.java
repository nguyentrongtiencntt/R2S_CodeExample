package labone;

import java.util.Scanner;

public class BT3_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("a number input :");
    int a = sc.nextInt();

    System.out.print("b number input :");
    int b = sc.nextInt();

    System.out.println("-------------------");

    String sumResult = String.format("Sum %d + %d is : %d ", a, b, a + b);
    System.out.println(sumResult);

    String minusResult = String.format("Minus %d - %d is : %d ", a, b, a - b);
    System.out.println(minusResult);

    String mulResult = String.format("Multiply %d * %d is : %d ", a, b, a * b);
    System.out.println(mulResult);

    if (b != 0) {
      String divResult = String.format("Divide %d * %d is : %f ", a, b, (double) a / b);
      System.out.println(divResult);
    } else System.out.println("Divide by zero!");

    String powResult = String.format("Power %d ^ %d is : %f ", a, b, Math.pow(a, b));
    System.out.println(powResult);
  }
}
