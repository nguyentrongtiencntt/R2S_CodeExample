package labone;

import java.util.Scanner;

public class Worker {
    private String name;
    private int yearofBirth;
    private String job;
    private String workPlace;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("input name:");
        name = sc.next();
        System.out.print("input yob:");
        yearofBirth = sc.nextInt();
        System.out.print("job: ");
        job = sc.next();

    }







}
