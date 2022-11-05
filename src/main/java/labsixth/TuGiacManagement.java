package labsixth;

public class TuGiacManagement {
    public static void main(String[] args) {
        TuGiac t1 = new TuGiac();
        TuGiac t2 = new TuGiac(5);
        TuGiac t3 = new TuGiac(5,6);

        t1.veTuGiac();
        System.out.println(t1.tinhChuVi());
        System.out.println(t1.tinhDienTich());

        t2.veTuGiac();
        System.out.println(t2.tinhChuVi());
        System.out.println(t2.tinhDienTich());

        t3.veTuGiac();
        System.out.println(t3.tinhChuVi());
        System.out.println(t3.tinhDienTich());
    }
}
