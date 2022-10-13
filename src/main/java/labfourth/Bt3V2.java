package labfourth;

import java.util.Random;

public class Bt3V2 {
  public static void main(String[] args) {

    int[] array = new int[20];
    for (int i = 0; i <array.length ; i++) {
      array[i] = new Random().nextInt(100);
    }

    boolean isPrime = false;
    for (int j = 0; j < array.length; j++)  {

      isPrime = checkPrime(array[j]);

      if (isPrime==true) System.out.println(array[j] + " is prime");
      else System.out.println(array[j] + " is not prime-----");

    }

  }

  private static boolean checkPrime(int n){
    boolean isPrime = false;
    int count = 0;

    for(int i = 2; i < n/2 ; i++){
      if (n % i == 0) {count++; break;}
    }

    if (count == 0) isPrime = true;

    return isPrime;
  }
}
