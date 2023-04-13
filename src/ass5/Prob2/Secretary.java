package ass5.Prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
    private double overTimeHours;

    public Secretary(String name,int year,int month,int day,double salary,double overTimeHours){
        super(name,salary,year,month,day);
        this.overTimeHours=overTimeHours;
    }
    public double getOverTimeHours(){
        return overTimeHours;
    }
    public void setOverTimeHours(double overTimeHours){
        this.overTimeHours=overTimeHours;
    }
    @Override
    public double computeSalary(){
        return super.computeSalary()+(12*overTimeHours);
    }
}
