import java.util.Scanner;

public class Problem_9_Even_Or_Odd {

    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        evenOrOdd(a);
        sc.close();
    }

    public static void evenOrOdd(int a) {
        if (a%2 == 0) {
            System.out.println("The number is even");
        } else System.out.println("The number is odd");
    }
}
