package labone;

import java.util.Scanner;

public class BT3_2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double fah = 0;
    System.out.print("Celsius input :");
    int celsius = sc.nextInt();

    // C/5 = (F-32)/9 => F = (C/5)*9 + 32
    fah = (celsius / 5) * 9 + 32;

    System.out.println("Fahrenheit temprature is : " + fah);
  }
}
