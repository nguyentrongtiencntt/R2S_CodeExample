package labsixth;

public class TuGiac {
    private int a;
    private int b;

    public TuGiac() {
    }
    public TuGiac(int a) {
        this.a = a;
    }
    public TuGiac(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void veTuGiac(){
        if(a==0 && b==0)
            System.out.println("Can not draw");
        if(a!=0 && b!=0)
            System.out.println("*");
    }

    public int tinhChuVi(){
        return (a*b)*2;
    }
    public int tinhDienTich(){
        return (a*b)*2;
    }
    public void phanLoaiTG(){
        if(a!=0 && b!=0 && a==b) System.out.println("Square");
        if(a!=0 && b!=0 && a!=b) System.out.println("Rectangle");
        if(a==0 && b==0) System.out.println("Do not know");
    }

}
