package labfifth.bai03;

import java.util.Scanner;

public class ThiSinh {
    private String hoten;
    private int sobaodanh;
    private double mon1, mon2, mon3;
    private boolean gioi, uutien;

    public String getHoten() {
        return hoten;
    }

    public int getSobaodanh() {
        return sobaodanh;
    }


    public double tinhDiemXetTuyen() {

        double sum = mon1 + mon2 + mon3;
        double dk1 = (1 + 0.5 + sum);
        double dk2 = 1 + sum;

        if (gioi == true && uutien == true) {
            return dk1;
        } else if (gioi == true) {
            return dk2;
        } else {
            return sum;
        }

    }

    public boolean kiemTraDiemLiet() {

        boolean check = false;

        if (mon1 == 0 || mon2 == 0 || mon3 == 0) {
            check = true;
        }
        return check;
    }

    public void nhapThongTin() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Ho ten: ");
        //hoten = nhap.nextLine();
        hoten = "Binh";
        System.out.println("So bao danh: ");
        //sobaodanh = nhap.nextInt();
        sobaodanh = 12345;
        System.out.println("Mon 1: ");
        //mon1 = nhap.nextDouble();
        mon1 = 5 ;
        //mon2 = nhap.nextDouble();
        mon2 = 5;
        System.out.println("Mon 3: ");
        //mon3 = nhap.nextDouble();
        mon3 = 5;
        System.out.println("Gioi?: ");
        //gioi = nhap.nextBoolean();
        gioi = true;
        System.out.println("Uu tien?: ");
        //uutien = nhap.nextBoolean();
        uutien = true;

    }
}
