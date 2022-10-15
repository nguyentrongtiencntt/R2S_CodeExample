package labone;


import java.util.Scanner;

public class Student {

    private int student_id;
    private String name;
    private byte age;
    private String address;
    private String className;

    private byte mathPoint;
    private byte physicPoint;
    private byte chemicalPoint;


    public void fillInfo(byte mathPoint, byte physicPoint){

        System.out.println(": ");
        setMathPoint(mathPoint);
        System.out.println("physicPoint: ");
        setPhysicPoint(physicPoint);

    }


    byte getMathPoint(){        return mathPoint;
    }

    private int sum(byte mP, byte pP, byte cP){
        return (mP + pP + cP);
    }


    float average(){
        return sum(mathPoint, physicPoint, chemicalPoint)/3;
    }


    public void setMathPoint(byte mathPoint) {
        if(mathPoint<0 || mathPoint >10)
            this.mathPoint = 0;
        else this.mathPoint = mathPoint;
    }

    public byte getPhysicPoint() {
        return physicPoint;
    }

    public void setPhysicPoint(byte physicPoint) {

        this.physicPoint = physicPoint;
    }

    public byte getChemicalPoint() {
        return chemicalPoint;
    }

    public void setChemicalPoint(byte chemicalPoint) {
        this.chemicalPoint = chemicalPoint;
    }
}
