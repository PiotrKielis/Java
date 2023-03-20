public class Calculator {
    public static final double PI = 3.141592653589793;
    public static final double E = 2.718281828459045;
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static double square(double number) {
        return Math.sqrt(number);
    }
    public static int absoluteValue(int number) {
        return Math.abs(number);
    }
    public static long round(double number) {
        return Math.round(number);
    }
    public static double pow(double number, double power) {
        return Math.pow(number,power);
    }
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("PI = " + Calculator.PI);
        System.out.println("e = " + Calculator.E);

        int number = 10;
        System.out.println(number + "is even: " + Calculator.isEven(number));

        double number2 = 16;
        System.out.println("Square from " + number2 + " = " + Calculator.square(number2));

        int number3 = -5;
        System.out.println("Absolute value from " + number3 + " = " +Calculator.absoluteValue(number3));

        double number4 = 3.7;
        System.out.println("Rounding " + number4 + " = " + Calculator.round(number4));

        double number5 = 2.0;
        double power = 3.0;
        System.out.println(number5 + " to power " + power + " = " + Calculator.pow(number5, power));

        int[] numbers = {1,2,3,4,5};
        System.out.println("Summary of numbers " + Arrays.toString(numbers) + " = " +Calculator.sum(numbers));
    }
}
