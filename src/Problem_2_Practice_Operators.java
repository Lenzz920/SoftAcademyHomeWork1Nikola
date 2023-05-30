import java.util.Scanner;

public class Problem_2_Practice_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your first whole number");
        int firstIntegerNumber = sc.nextInt();

        System.out.println("Please, enter your second whole number");
        int secondIntegerNumber = sc.nextInt();

        System.out.println(firstIntegerNumber + " + " + secondIntegerNumber + " = " + sumResult(firstIntegerNumber, secondIntegerNumber));
        System.out.println(firstIntegerNumber + " - " + secondIntegerNumber + " = " + subtractionResult(firstIntegerNumber, secondIntegerNumber));
        System.out.println(firstIntegerNumber + " * " + secondIntegerNumber + " = " + multiplicationResult(firstIntegerNumber, secondIntegerNumber));
        if(secondIntegerNumber == 0) {
            System.out.println("Can't divide by 0");
        } else
            System.out.println(firstIntegerNumber+ " / " + secondIntegerNumber + " = " + deletionResult(firstIntegerNumber, secondIntegerNumber));

        System.out.println("");

        System.out.println("Now, please enter your first decimal number");
        double firstDoubleNumber = sc.nextDouble();

        System.out.println("Now, please enter your second decimal number");
        double secondDoubleNumber = sc.nextDouble();

        System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + sumResult(firstDoubleNumber, secondDoubleNumber));
        System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + subtractionResult(firstDoubleNumber, secondDoubleNumber));
        System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + multiplicationResult(firstDoubleNumber, secondDoubleNumber));
        if(secondDoubleNumber == 0) {
            System.out.println("Can't divide by 0");
        } else
            System.out.println(firstDoubleNumber+ " / " + secondDoubleNumber + " = " + deletionResult(firstDoubleNumber, secondDoubleNumber));
    }

    static double sumResult(double a, double b){
        return a + b;
    }

    static double subtractionResult (double a, double b) {
        return a - b;
    }

    static double multiplicationResult (double a, double b) {
        return a * b;
    }

    static double deletionResult (double a, double b) {
        double result = b != 0 ? a / b : 0.0d;
        return result;
    }
}
