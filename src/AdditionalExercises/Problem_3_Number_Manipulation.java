package AdditionalExercises;

import java.util.Scanner;

public class Problem_3_Number_Manipulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide a 4-digit number");

        int abcd = sc.nextInt();
        String text = "" + abcd;

        if(text.length() != 4) throw new RuntimeException ("You did not provide a 4-digit number");

        char a = text.charAt(text.length()-4);
        char b = text.charAt(text.length()-3);
        char c = text.charAt(text.length()-2);
        char d = text.charAt(text.length()-1);

        int aNum = Character.getNumericValue(a);
        int bNum = Character.getNumericValue(b);
        int cNum = Character.getNumericValue(c);
        int dNum = Character.getNumericValue(d);

        System.out.println(aNum + bNum + cNum + dNum);
        System.out.println(new String(new char[] {d, b, c, a}));
        System.out.println(new String(new char[] {d, c, b, a}));

        sc.close();
    }

}
