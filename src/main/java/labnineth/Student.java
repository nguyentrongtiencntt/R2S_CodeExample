package labnineth;

public class Student {
    private int id;
    private int name;

    synchronized public void printPoint(){
        for (int i = 0; i < 10 ; i++) {
            try {
                System.out.print(i + " ");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
