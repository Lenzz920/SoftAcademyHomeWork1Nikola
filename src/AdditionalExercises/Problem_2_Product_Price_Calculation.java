package AdditionalExercises;

import java.util.Scanner;

public class Problem_2_Product_Price_Calculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide the product price");
        double productPrice = sc.nextDouble();

        System.out.println("Please provide your discount, between 0 and 100");
        double discount = sc.nextDouble();



        if(discount < 0 || discount > 100) {
            System.out.println("Your discount is invalid");
        } else {
            double discountValue = productPrice * (discount / 100);
            double finalPrice = productPrice - discountValue;
            System.out.println("The final price of the product is: " + finalPrice);
            System.out.println("The amount of money you save is: " + discountValue);
        }

        sc.close();
    }

}
