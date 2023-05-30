import java.util.Scanner;

public class Problem_12_Rectangle_Area {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide the length of the rectangle");
        double length = sc.nextDouble();

        System.out.println("Please provide the width of side the rectangle");
        double width = sc.nextDouble();

        double rectangleArea = length * width;

        System.out.println("The area of the rectangle is " + rectangleArea);
        sc.close();
    }

}
