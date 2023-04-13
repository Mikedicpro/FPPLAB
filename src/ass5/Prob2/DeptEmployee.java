package ass5.Prob2;

import java.time.LocalDate;
/*Problem : 2
A university department consists of professors and secretaries. Each professor and each secretary
has a name, a salary, and a hire date. Use inheritance and polymorphism to create an application
that represents the department and its professors and secretaries as objects, and provides a test
class that creates 3 professors and 2 secretaries, and then outputs the combined total of all of
their salaries.
Start by creating classes
Professor
Secretary
DeptEmployee
having the following relationship:
Place instance fields and corresponding accessor/mutator methods in DeptEmployee to represent
name and hire date (as a type of LocalDate )(do not create accessors or mutators for salary). Do
not put these fields in either the Professor or Secretary class. Also place in the Professor class an
int field numberOfPublications, with corresponding accessor and mutator methods. Place in the
Secretary class a double field overtimeHours, also with corresponding accessor and mutator
methods.
Place a computeSalary method in DeptEmployee which simply returns the value stored in salary.
Override the computeSalary method in Secretary so that the return value is the sum of the value
of salary plus 12 times the number of overtime hours.
Then in the main method of a class named Main, create three instances of Professor and two
instances of Secretary (you can invent the values to pass into the constructor). Finally, create an
array of department employees:
DeptEmployee[] department = new DeptEmployee[5]
DeptEmployee
Professor Secretary
and then populate the array with the Professor and Secretary instances you have just created.
Then ask the user if he wishes to see the sum of all Professor and Secretary(means all
DeptEmployee array objects) salary in the department. If the user responds "Y", then loop
through the department array and polymorphically read, and sum, all salaries, and output the
result to the console.
* */
public class DeptEmployee {
    private String name;
    private double salary;
    private LocalDate hirDate;
    DeptEmployee(String name,double salary,int year,int month,int day){
        this.name=name;
        this.salary=salary;
        this.hirDate=LocalDate.of(year,month,day);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public LocalDate getHirDate(){
        return hirDate;
    }
    public void setHirDate(LocalDate hirDate){
        this.hirDate=hirDate;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double computeSalary(){
        return salary;
    }
}
