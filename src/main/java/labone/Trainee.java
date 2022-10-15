package labone;

import java.util.Scanner;

public class Trainee {

    private int id;
    private String name;

    public Trainee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display(){
        String info = String.format("id %d, name %s",id, name);
        System.out.println(info);
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Current object is: id %d, name %s",id, name);
    }

    public float sum(int a, int b){
        float f = 0;
        return f;
    }
}
