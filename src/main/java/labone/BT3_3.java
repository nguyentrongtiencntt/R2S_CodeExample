package labone;

import java.util.Scanner;

public class BT3_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Math point input: ");
    double math = sc.nextDouble();

    System.out.print("Physic point input: ");
    double physic = sc.nextDouble();

    System.out.print("Chemical point input: ");
    double chemical = sc.nextDouble();

    System.out.println("-------------------");

    double sum = math + physic + chemical;
    System.out.println("Sum of 3 subjects is " + sum);

    double average = (math + physic + chemical) / 3.0;

    System.out.println("Average is : " + average);
  }
}
