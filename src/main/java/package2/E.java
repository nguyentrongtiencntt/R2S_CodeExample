package package2;

import package1.A;

public class E extends A {
    public static void main(String[] args) {
        A a = new A();
        a.method1_pub();

    }
    void subMethod(){
        method2_pro();
        method_private();

    }
    private void method_private(){

    }
}
