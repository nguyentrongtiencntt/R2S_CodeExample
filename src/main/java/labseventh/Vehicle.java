package labseventh;

import java.util.Scanner;

public class Vehicle {
    private String ten;
    private String tenLoai;
    private int dungTich;
    private int triGia;

    public Vehicle() {
    }

    public Vehicle(String ten, String tenLoai, int dungTich, int triGia) {
        this.ten = ten;
        this.tenLoai = tenLoai;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public int getDungTich() {
        return dungTich;
    }

    public String getTen() {
        return ten;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public int getTriGia() {
        return triGia;
    }

    public void setDungTich(int dungTich) {
        if (dungTich<0){
            this.dungTich = 0;
        }else {
            this.dungTich = dungTich;
        }
    }

    public void setTriGia(int triGia) {
        if (triGia<0){
            this.triGia = 0;
        }else {
            this.triGia = triGia;
        }
    }

    public void setTen(String ten) {
        if (ten==null || ten.isEmpty()){
            this.ten = "Khong biet";
        }else {
            this.ten = ten;
        }
    }

    public void setTenLoai(String tenLoai) {
        if (tenLoai==null || tenLoai.isEmpty()){
            this.tenLoai = "Khong biet";
        }else {
            this.tenLoai = tenLoai;
        }
    }

    public void hienThiThongTin(){
        /*
        String info = String.format("\nTen chu xe la: %s " +
                "\nTen loai xe la: %s " +
                "\nDung tich xe la: %d " +
                "\nTri gia xe la: %d\n"
                ,ten,tenLoai,dungTich,triGia);
        System.out.printf(info);*/

        System.out.println("\nTen chu xe la: " + this.ten);
        System.out.println("Ten loai xe la: " + this.tenLoai);
        System.out.println("Dung tich xe la: " + this.dungTich);
        System.out.println("Tri gia xe la: " + this.triGia);
    }

    public void nhapXe(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten chu xe: ");
        ten = "Khuong!";//sc.next();

        System.out.println("Nhap ten loai xe: ");
        tenLoai = "Lead";// sc.next();

        System.out.println("Nhap dung tich xe: ");
        setDungTich(sc.nextInt());


        System.out.println("Nhap tri gia xe: ");
        setTriGia(sc.nextInt());

    }
    public int thueTruocBa(){
        int heSo=0;
        int thueTruocBa =heSo * triGia;
        if (dungTich<100){
            heSo=1;
        }else if (dungTich>=100 && dungTich<200){
            heSo=3;
        }else if (dungTich >= 200){
            heSo=5;
        }
        System.out.println("Thue truoc ba cua xe " + tenLoai + " la: "+ (heSo*triGia));
        return heSo*triGia;
    }

    public void sum(){

    }
}
