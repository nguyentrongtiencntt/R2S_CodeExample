package labten;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    private int year;


    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }
    @Override
    public String toString() {
        return "ID ='" + id + '\'' +
                ", Name ='" + name + '\'' +
                ", Year of birth =" + yob;
    }

    @Override
    public int compareTo(Student o) {
        if (getId()<o.getId())
            return -1;
        else if (getId()>o.getId())
            return 1;
        else
            return 0;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }


}
