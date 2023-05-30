import java.util.Scanner;

public class Problem_6_Currency_Convertor {

    public static void main(String[] args) {
        System.out.println("Please, enter BGN value to be converted to euros");

        Scanner sc = new Scanner(System.in);
        double BGN = sc.nextDouble();
        double euro = BGN / 1.96;

        System.out.println("BGN value: " + BGN + " leva, is equal to " + euro + " euros");

        sc.close();
    }

}
