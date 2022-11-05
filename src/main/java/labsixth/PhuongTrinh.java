package labsixth;

public class PhuongTrinh {
    private int a;
    private int b;
    private int c;

    public PhuongTrinh(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int timDelta() {
        return b * b - 4 * a * c;
    }

    public void giaiPhuongTrinh() {
        double x, x1, x2;
        if (timDelta() < 0) System.out.println("PTVN");
        else if (timDelta() == 0) {
            System.out.println("NK");
            x = (-b/2*a);
            System.out.println("x1 = x2 = " + x);
        } else {
            System.out.println("HNPB");
            x1 = -b + Math.sqrt(timDelta()) / (2 * a);
            x2 = -b - Math.sqrt(timDelta()) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
