public class Problem_3_Exchange_Two_Values {

    public static void main(String[] args) {

        int a = 68286;
        int b = 1251251;

        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("The value of a is now: " + a);
        System.out.println("The value of b is now: " + b);
    }
}
