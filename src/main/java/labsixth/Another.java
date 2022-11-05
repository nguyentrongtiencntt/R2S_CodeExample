package labsixth;

public class Another {
        public static String comparePhone(SmartPhone s1, SmartPhone s2){
        String soSanh = "";
        if(s1.getPrice() > s2.getPrice()){
            soSanh = String.format("Điện thoai: %s mắc hơn %s", s1.getPhoneName(), s2.getPhoneName() );
        }else if(s1.getPrice() < s2.getPrice()) {
            soSanh = String.format("Điện thoai: %s rẻ hơn %s", s1.getPhoneName(), s2.getPhoneName() );
        } else {
            soSanh = String.format("Điện thoai: %s ngang giá hơn %s", s1.getPhoneName(), s2.getPhoneName() );
        }
        return soSanh;
    }
}
