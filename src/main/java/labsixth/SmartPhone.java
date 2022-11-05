package labsixth;


import java.util.Scanner;

public class SmartPhone {

    private String phoneName, provider;
    private float ram, price;

    public SmartPhone() {
        setPhoneName("NULL");
        setProvider("Unknown");
        setPrice(0);
        setRam(0);
    }

    public SmartPhone(String phoneName, String provider, float ram, float price) {
        setPhoneName(phoneName);
        setProvider(provider);
        setRam(ram);
        setPrice(price);
    }

    public void iputInfoPhone(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Phone name: ");
        phoneName = sc.nextLine();
        System.out.println("Provider: ");
        provider = sc.nextLine();
        System.out.println("Ram: ");
        ram = sc.nextFloat();
        System.out.println("Price: ");
        price = sc.nextFloat();

    }
    public void showInfoPhone(){
        System.out.println("Phone name: " + getPhoneName());
        System.out.println("Provider: " + getProvider());
        System.out.println("Ram: " + getRam());
        System.out.println("Price: " + getPrice());
    }
    public String comparePhone(SmartPhone s2){
        String result = "";
        String st1 = String.format("Điện thoai: %s mắc hơn %s", getPhoneName(), s2.getPhoneName());
        String st2 = String.format("Điện thoai: %s rẻ hơn %s", getPhoneName(), s2.getPhoneName() );
        String st3 = String.format("Điện thoai: %s ngang giá hơn %s", getPhoneName(), s2.getPhoneName() );

        if(getPrice() > s2.getPrice()){
            result = st1 ;
        }else if(getPrice() < s2.getPrice()) {
            result = st2 ;
        } else {
            result = st3;
        }
        return result;
    }

//    public String comparePhone(SmartPhone s1, SmartPhone s2){
//        String soSanh = "";
//        if(s1.getPrice() > s2.getPrice()){
//            soSanh = String.format("Điện thoai: %s mắc hơn %s", s1.getPhoneName(), s2.getPhoneName() );
//        }else if(s1.getPrice() < s2.getPrice()) {
//            soSanh = String.format("Điện thoai: %s rẻ hơn %s", s1.getPhoneName(), s2.getPhoneName() );
//        } else {
//            soSanh = String.format("Điện thoai: %s ngang giá hơn %s", s1.getPhoneName(), s2.getPhoneName() );
//        }
//        return soSanh;
//    }



    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
