package labeighth;

public class Administration extends Staff {




    protected double phuCap;

    public Administration(String name, int id, float salaryBase, float yearofWork) {

        super(name, id, salaryBase, yearofWork);
    }

    public Administration(String name, int id, float salaryBase, float yearofWork, double phuCap) {
        super(name, id, salaryBase, yearofWork);
        this.phuCap = phuCap;
    }
    @Override
    public double calSalary(){
        //logic
        return 0;
    }
    @Override
    public void displayinfo(){
        System.out.println("Employee Info!");
    }



}
