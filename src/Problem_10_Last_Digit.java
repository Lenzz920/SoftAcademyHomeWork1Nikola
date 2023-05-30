import java.util.Scanner;

public class Problem_10_Last_Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a random number");
        double a = sc.nextDouble();

        // Ако числото, което се попълни е 17, понеже типът е double, логиката го прочита като 17.0 и
        // последната цифра реално не е 7. Исках да напиша логика, в която без значение дали
        // подаденото число има или няма цифри след точката, да може да даде правилен отговор.
        // Сетих се само чрез конвертиране и if, възможно е да има по-чист вариант да се напише.
        // Единственият сценарии, при който гърми е, ако числото е 12.70...

        if(a % 1 == 0) {
            int b = (int) a;
            if(b % 10 == 7){
                System.out.println("The last digit of your number is 7");
            } else {
                System.out.println("The last digit of your number is not 7");
            }
        } else {
            String test = "" + a;
            char lastNumber = test.charAt(test.length() - 1);
            if(lastNumber == '7') {
                System.out.println("The last digit of your number is 7");
            } else {
                System.out.println("The last digit of your number is not 7");
            }
        }

        sc.close();

    }

}
