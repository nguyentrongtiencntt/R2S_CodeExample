package labeighth;

public class Staff {
    protected String name;
    protected int id;
    protected float salaryBase;
    protected float rate;
    protected float yearofWork;

    public Staff(String name, int id, float salaryBase, float yearofWork) {
        this.name = name;
        this.id = id;
        this.salaryBase = salaryBase;
        this.yearofWork = yearofWork;
    }

    private Staff() {
    }


    public double getSalary(){
        //logic
        return 0;
    }
    public void yearOf(int yearofWork){
        if(yearofWork<0) yearofWork = 0;
        else this.yearofWork = yearofWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalaryBase() {
        return salaryBase;
    }

    public void setSalaryBase(float salaryBase) {
        this.salaryBase = salaryBase;
    }
    public double calSalary(){
        //logic
        return 0;
    }
    public void displayinfo(){
        System.out.println("Employee Info!");
    }
}
