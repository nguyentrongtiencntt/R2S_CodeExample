package labone;

import java.util.Scanner;

public class BT1 {
  public static void main(String[] args) {

    double length = 0, width = 0, area = 0, cir = 0;

    Scanner sc = new Scanner(System.in);
    System.out.print("length input :");
    length = sc.nextDouble();

    System.out.print("width input :");
    width = sc.nextDouble();

    area = length * width;
    cir = (length + width) * 2.0;

    System.out.println("---------------");
    System.out.println("Area =" + area);
    System.out.print("---------------");
    System.out.println("\nCircumference = " + cir);
  }
}
