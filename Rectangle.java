import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj długość boku a: ");
        double a = input.nextDouble();

        System.out.print("Podaj długość boku b: ");
        double b = input.nextDouble();

        double pole = a * b;
        double obwod = 2 * (a + b);

        System.out.println("Pole prostokąta: " + pole);
        System.out.println("Obwód prostokąta: " + obwod);
    }
}