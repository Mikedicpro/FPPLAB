package ass5.Prob2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor professor1=new Professor("Mike",119_000,2023,9,18,10);
        Professor professor2=new Professor("John",202400,2024,1,19,50);
        Professor professor3= new Professor("Burmaa",250_000,2024,12,06,100);

        Secretary secretary1=new Secretary("Mary Brown",2025,8,25,200.54,12);
        Secretary secretary2=new Secretary("Dave Eskis",20252,7,27,450.33,45);

        DeptEmployee[] department=new DeptEmployee[]{professor1,professor2,professor3,secretary1,secretary2};

        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to see the total salary for all department employees?  (Y/N)");
        String input=sc.nextLine();
        if(input.equalsIgnoreCase("Y")) {
            double totalSalary = 0.0;
            for (DeptEmployee employee : department) {
                totalSalary += employee.computeSalary();
            }
            System.out.println("Total salary for all department employees: " + totalSalary);
        }
            else{
            System.out.println("you press the wrong button please try again ");
            }

        }

    }

