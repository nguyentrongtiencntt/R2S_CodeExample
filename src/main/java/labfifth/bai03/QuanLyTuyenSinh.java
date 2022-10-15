package labfifth.bai03;

public class QuanLyTuyenSinh {

    public static void main(String[] args) {

        ThiSinh thiSinh = new ThiSinh();
        thiSinh.nhapThongTin();

        DaiHoc HSU = new DaiHoc("DH Hoa Sen", 15);
        DaiHoc UTE = new DaiHoc("DH SPKT TPHCM", 23);
        DaiHoc SGU = new DaiHoc("DH Sài Gòn", 15.5);

        System.out.println(HSU.xetTuyen(thiSinh));
        System.out.println(UTE.xetTuyen(thiSinh));
        System.out.println(SGU.xetTuyen(thiSinh));

        System.out.println("==========");




    }
}
