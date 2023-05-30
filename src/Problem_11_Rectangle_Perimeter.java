import java.util.Scanner;

public class Problem_11_Rectangle_Perimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide the length of the rectangle");
        double length = sc.nextDouble();

        System.out.println("Please provide the width of side the rectangle");
        double width = sc.nextDouble();

        double rectanglePerimeter = 2 * (length + width);

        System.out.println("The perimeter of the rectangle is " + rectanglePerimeter);
        sc.close();
    }
}
