import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj cyfrę od 1 do 7: ");
        int dayOfWeek = input.nextInt();

        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Poniedziałek";
                break;
            case 2:
                dayName = "Wtorek";
                break;
            case 3:
                dayName = "Środa";
                break;
            case 4:
                dayName = "Czwartek";
                break;
            case 5:
                dayName = "Piątek";
                break;
            case 6:
                dayName = "Sobota";
                break;
            case 7:
                dayName = "Niedziela";
                break;
            default:
                dayName = "Nieznany dzień";
                break;
        }

        System.out.println("Dzień tygodnia: " + dayName);
    }
}
