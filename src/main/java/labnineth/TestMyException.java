package labnineth;

import java.util.*;

public class TestMyException {
    public static void main(String[] args) {

        Student student = new Student();


        new Thread(() -> {
                    student.printPoint();
            System.out.println(Thread.currentThread());

        }).start();

        new Thread(() -> {
                student.printPoint();
        }).start();




    }
}
