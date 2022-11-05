package labsixth;

public class SmartPhoneManagement {
    public static void main(String[] args) {


        SmartPhone s1 =
                new SmartPhone("Iphone5","Iphone",
                        2,2000);
        SmartPhone s2
                = new SmartPhone("Galaxy","Samsung",
                4,1500);

        System.out.println(s1.comparePhone(s2));

        System.out.println("Stop!");

    }
}
