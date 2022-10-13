package labfourth;

import java.util.Random;

//prime
public class BT3 {
  public static void main(String[] args) {

    int[] array = new int[20];

    for (int i = 0; i < array.length; i++) {
      array[i] = new Random().nextInt(10);

    }

    int count = 0;
    int n = 0;
    for (int i = 0; i < array.length ; i++) {
      count = 0;
      n = array[i];

      if(array[i]==0 || array[i]==1 ) continue;

      for (int j = 2; j < n/2; j++){
        if (array[i]%j==0) count++;
      }

      if (count == 0) System.out.println(array[i] + " is prime!");
      else System.out.println(array[i] + " is not prime!");
    }

  }
}
