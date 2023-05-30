package AdditionalExercises;

import java.util.Scanner;

public class Problem_1_Trapezoid_Area {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide the length of the first base");
        double baseOne = sc.nextDouble();

        System.out.println("Please provide the length of the second base");
        double baseTwo = sc.nextDouble();

        System.out.println("Please provide the height of the first base");
        double height = sc.nextDouble();

        double trapezoidArea = 0.5 * ((baseOne + baseTwo) * height);

        System.out.println("The area of the trapezoid is " + trapezoidArea);
        sc.close();
    }

}
