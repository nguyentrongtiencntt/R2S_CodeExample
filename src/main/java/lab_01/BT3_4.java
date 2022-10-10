package lab_01;

import java.util.Scanner;

public class BT3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("number input: ");
        short num = sc.nextShort();
        System.out.println("-------------------");

        if (num <= 999 && num >= 100) {
            System.out.println("hundreds: " + (num/100));
            System.out.println("tens: " + (num % 100) / 10);
            System.out.println("units " + (num % 100) % 10);
        } else {
            System.out.println("your input number must in range 100...999");
        }
    }
}
