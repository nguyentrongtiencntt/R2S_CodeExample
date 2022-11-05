package labseventh;

import java.util.Scanner;

public final class Account {
    private int maPin;
    private int soDuTK;
    private String tenTK;

    public Account() {
    }

    public Account(int soDuTK, String tenTK) {
        this.soDuTK = soDuTK;
        this.tenTK = tenTK;
    }

    public int getSoDuTK() {
        return soDuTK;
    }

    public int getMaPin() {
        return maPin;
    }

    public void setSoDuTK(int soDuTK) {
        this.soDuTK = soDuTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public void setMaPin(int maPin) {
        this.maPin = maPin;
    }

    public void hienThongTin(){
        System.out.println("Ten tai khoan: " + tenTK);
        System.out.println("So du tai khoan: " + soDuTK);
    }

    public void rutTien(){
        System.out.println("\nNhap so tien muon rut: ");
        int tienMuonRut= sc.nextInt();

        if (soDuTK >0){
            if (soDuTK > tienMuonRut){
                soDuTK = soDuTK - tienMuonRut;
                System.out.println("\nRut tien thanh cong !");
            }else {
                System.out.println("\nTai khoan khong co du tien de rut !");
            }
        }

        System.out.println("\nSo du tai khoan: " + soDuTK);
    }

    public void soDu(int tienMuonRut){
        soDuTK = soDuTK + tienMuonRut;
    }

    //ac1 (current-this)--> ac2

    Scanner sc = new Scanner(System.in);
    public void chuyenKhoan(Account ac2){
        System.out.println("\nNhap so tien muon chuyen: ");
        int tienMuonChuyen= sc.nextInt();

        if (this.getSoDuTK() > 0 && this.getSoDuTK() >= tienMuonChuyen ){

            ac2.setSoDuTK(ac2.getSoDuTK() + tienMuonChuyen);
            this.setSoDuTK(this.getSoDuTK()-tienMuonChuyen);

            System.out.println("\nDa chuyen khoan thanh cong !");
        }else {
            System.out.println("\nTai khoan khong co du tien de chuyen !");
        }
    }

    public void thayDoiPin(){
        System.out.println("Input new pin!");
        setMaPin(sc.nextInt());

    }
}

