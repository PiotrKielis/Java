import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        int min = array[0];
        int max = array[0];
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            sum += array[i];
        }
        double avg = sum / 10;

        int smaller = 0;
        int larger = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] < avg) {
                smaller++;
            } else if (array[i] > avg) {
                larger++;
            }
        }

        int[] counts = new int[41];
        for (int i = 0; i < 10; i++) {
            counts[array[i] + 20]++;
        }

        System.out.println("Tablica: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nNajmniejszy element: " + min);
        System.out.println("Największy element: " + max);
        System.out.println("Średnia arytmetyczna: " + avg);
        System.out.println("Ilość elementów mniejszych od średniej: " + smaller);
        System.out.println("Ilość elementów większych od średniej: " + larger);
        for (int i = 0; i < 41; i++) {
            if (counts[i] > 0) {
                System.out.println("Liczba " + (i - 20) + " występuje " + counts[i] + " razy.");
            }
        }
    }
}
