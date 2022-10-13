package labone;

import java.util.Scanner;

public class BT2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Package number input : ");
    int pack = sc.nextInt();

    System.out.print("Distance input : ");
    int distance = sc.nextInt();

    System.out.print("Working day (shift) input : ");
    int shift = sc.nextInt();

    System.out.print("Good rating feedback : ");
    int feedback = sc.nextInt();

    System.out.print("Call input : ");
    int call = sc.nextInt();

    System.out.print("Cash pay for employee : ");
    int electric = sc.nextInt();

    System.out.print("Cash pay more : ");
    int other = sc.nextInt();

    double salary =
        (double) (pack * 50 + distance * 75)
            + (double) (shift * 50) * 0.1
            + (double) feedback
            + (double) call
            + (double) electric
            + (double) other;
    System.out.print("---------------------------");
    System.out.print("Employee Salary = " + salary);
  }
}
