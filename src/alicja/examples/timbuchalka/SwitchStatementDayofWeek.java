package alicja.examples.timbuchalka;

public class SwitchStatementDayofWeek {
    public static void main(String[] args) {
        printDayofWeek(3);
    }


    public static void printDayofWeek(int a) {
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wendesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No day of the week found for this number");
                break;
        }
    }
}