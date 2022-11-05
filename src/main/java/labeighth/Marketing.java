package labeighth;

public class Marketing extends Staff{

    protected double doanhSo;

    public Marketing(String name, int id, float salaryBase, float yearofWork) {
        super(name, id, salaryBase, yearofWork);
    }

    public Marketing(String name, int id, float salaryBase,
                     float yearofWork, double doanhSo) {
        super(name, id, salaryBase, yearofWork);
        this.doanhSo = doanhSo;
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
