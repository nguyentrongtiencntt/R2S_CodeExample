package labseventh;

public class Person {

    //overloading
    public void display(){
        System.out.println("this is person!");
    }
    public void display(String message){
        System.out.println("this is person!");
    }
    public void display(String message, int order){
        System.out.println("this is person!");
    }
    public void display( int order, String message){
        System.out.println("this is person!");
    }
    public void display(String message, float order){
        System.out.println("this is person!");
    }


}
