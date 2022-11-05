package labseventh;

public abstract class Animal {

    private int x;
    public abstract void run();
    public abstract void runtest();
    public abstract void runtesting();

    //non-abstract
    public int getLeg(){
        return x;
    }
    //implement all abstract method
}
