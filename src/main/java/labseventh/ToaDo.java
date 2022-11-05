package labseventh;

public class ToaDo extends Object implements ITestable  {
    private String name;
    private int x;
    private int y;

    public ToaDo() {
    }

    public ToaDo(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        super.toString();
        String print = String.format("%s(%d,%d)",name, x, y);
        return print ;
    }

    @Override
    public void test() {

    }
}
