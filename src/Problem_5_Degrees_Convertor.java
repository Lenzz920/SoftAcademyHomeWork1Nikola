import java.util.Scanner;

public class Problem_5_Degrees_Convertor {

    public static void main(String[] args) {
        System.out.println("Please, enter degrees by Celsius to convert to Fahrenheit");

        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Fahrenheit is: " + fahrenheit + " F");
        sc.close();
    }

}
