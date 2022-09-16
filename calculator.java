import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        int number1, number2, functionType;
        double result = -1;

        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to do?\n    1: exponential\n    2: nth root");
        functionType = in.nextInt();
        System.out.println("Please enter two integers, separated by a space.\nThe first being the base number, the second being the exponent: ");
        number1 = in.nextInt();
        number2 = in.nextInt();
        in.close();
        if (functionType == 1) {
            Exponential exp = new Exponential();
            result = exp.computeExponent(number1, number2);
        } else if (functionType == 2) {
            Root r = new Root();
            result = r.computeRoot(number1, number2);
        }

        System.out.println("Result is: " + result);
    }
}
