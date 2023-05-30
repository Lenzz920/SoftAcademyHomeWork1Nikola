public class Problem_4_Exchange_Three_Values {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;

        int placeholder = a;

        //a = b
        //b = c
        //c = a

        a = b;
        b = c;
        c = placeholder;


        System.out.println("The value of a is now: " + a);
        System.out.println("The value of b is now: " + b);
        System.out.println("The value of c is now: " + c);

    }
}
