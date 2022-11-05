package labten;

import java.util.ArrayList;

public class Main {

    private static ListStudent listStudent = new ListStudent();

    public static void main(String[] args) {

        Student student1 = new Student(1,"Khoi",2007);
        Student student2 = new Student(2,"Tien",2009);
        Student student3 = new Student(3,"Nhung",2010);
        Student student4 = new Student(4,"Doan",2015);
        Student student5 = new Student(5,"Hien",1991);

        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);




        Student stdId = listStudent.findbyId(1);
        ArrayList<Student> stdsName = listStudent.findbyName("ie");


        System.out.println("AAAAA");



    }
}

