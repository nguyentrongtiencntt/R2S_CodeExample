package labten;

import java.rmi.StubNotFoundException;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListStudent extends ArrayList<Student > {

    // not same id
    @Override
    public boolean add(Student student) {
        for (Student std: this) {
            if (std.getId()==student.getId())
            try {
                    throw new Exception("same id");
            } catch (Exception e) {
                    throw new RuntimeException(e);
            }

        }

        return super.add(student);
    }

    public void printListStudent(){
        for (Student student: this) {
            System.out.println(student);
        }
    }

    public Student remove(int id){
        for (Student student: this) {
            if(student.getId()==id){
                remove(student);
                return student;
            }
        }
        return null;
    }

    public Student update(int id, String newName){
        for (Student student: this) {
            if(student.getId()==id){
                student.setName(newName);
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> findbyName(String name){
        ArrayList students = new ArrayList();
        for (Student student: this) {
            if (student.getName().contains(name))
                students.add(student);
        }
        return students;
    }

    public Student findbyId(int id){
        for (Student student: this) {
            if (student.getId()==id)
                return student;
        }
        return null;
    }
    public void sort(){
        Collections.sort(this);
    }
}
