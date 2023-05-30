package AdditionalExercises;

import java.util.Scanner;

public class Problem_4_Salary_Calculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide your salary");
        double salary = sc.nextDouble();

        double newSalary = salary;

        for(int month = 0; month < 3; month++){
            newSalary += (salary * 0.1);
            salary = newSalary;
        }

        System.out.println("In 3 months your salary will be: " + newSalary);

        sc.close();
    }

}
