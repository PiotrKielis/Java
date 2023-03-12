public class SumFromOneToHundred {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= 100);

        System.out.println("Suma liczb od 1 do 100 wynosi: " + sum);
    }
}
