import java.util.Scanner;

public class Problem_13_Circle_Area {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide the radius of the circle");
        double radius = sc.nextDouble();

        double circleArea = Math.PI * Math.pow(radius,2);

        System.out.println("The area of the circle is " + circleArea);
        sc.close();
    }

}
