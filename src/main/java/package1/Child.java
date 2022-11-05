package package1;

public class Child extends Parent {

    private String childName;
    public Child() {

    }

    public Child(String name, String childName) {
        super(name);
        this.childName = childName;

    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public void sum(int a, int b){
        System.out.println("this is child sum");
    }
    private void useSum(){
        super.sum(5,6);
        sum(7,8); //where are you now? can you hear?
    }

}
