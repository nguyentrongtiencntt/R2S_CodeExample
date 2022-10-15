package labfifth.bai03;

public class DaiHoc {

    private String tenTruong ;
    private double diemChuan;

    public DaiHoc(String tenTruong, double diemChuan) {
        this.tenTruong = tenTruong;
        this.diemChuan = diemChuan;
    }

    public String xetTuyen(ThiSinh thiSinh){
        String result = "";

        if(thiSinh.tinhDiemXetTuyen() >= diemChuan && !thiSinh.kiemTraDiemLiet()){
            result = String.format("Congratulation %s %d pass into %s ",
                            thiSinh.getHoten(), thiSinh.getSobaodanh(), tenTruong );
        } else result = String.format("Regret %s %d no pass into %s ",
                thiSinh.getHoten(), thiSinh.getSobaodanh(), tenTruong );

        return result;

    }
}
