import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String firstName = scanner.next();
        System.out.println("What is your last name?");
        String lastName = scanner.next();

        // predicts when to retire
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int retire = 10;
        if (age % 2 == 0) {
            retire = 13;
        }
        // predicts bank balance
        System.out.println("What month were you born in? (please answer with month number.)");
        int month = scanner.nextInt();
        int bank;
        if (month > 0 && month <= 4) {
            bank = 77777777;
        } else if (month >= 5 && month <= 8) {
            bank = 555555555;
        } else if (month >= 9 && month <= 12) {
            bank = 666666;
        } else {
            bank = 0;
        }

        // predicts mode of transportation
        System.out.println("What is you favorite R,O,Y,G,B,I,V color? (enter Help for color options)");
        String color = scanner.next();
        String[] cars = { "beetle", "mustang", "smart car", "tesla", "jeep", "school bus", "porch", "broken down car" };
        String myCar;
        while (color.equals("help") || color.isBlank()) {
            System.out.println("color options: red, orange, yellow, green, blue, indigo, violet");
            System.out.println("What is you favorite R,O,Y,G,B,I,V color? (enter Help for color options)");
            color = scanner.next();
        }
        switch (color) {
            case "red":
                myCar = cars[0];
                break;
            case "orange":
                myCar = cars[1];
                break;
            case "yellow":
                myCar = cars[2];
                break;
            case "green":
                myCar = cars[3];
                break;
            case "blue":
                myCar = cars[4];
                break;
            case "indigo":
                myCar = cars[5];
                break;
            case "violet":
                myCar = cars[6];
                break;
            default:
                myCar = cars[7];
        }

        // that predicts vacation home
        System.out.println("How many siblings do you have?");
        int siblings = scanner.nextInt();
        String[] states = { "Alaska", "New Jersey", "Mississippi", "Florida", "Washington", "Taco Bell" };
        String retirementHome;
        if (siblings == 0) {
            retirementHome = states[0];
        } else if (siblings == 1) {
            retirementHome = states[1];
        } else if (siblings == 2) {
            retirementHome = states[2];
        } else if (siblings == 3) {
            retirementHome = states[3];
        } else if (siblings < 0) {
            retirementHome = states[5];
        } else
            retirementHome = states[4];
        scanner.close();
        System.out.printf(
                "%s %s will retire in %d years with $%,d in the bank, a vacation home in %s, and travel by %s.",
                firstName, lastName, retire, bank, retirementHome, myCar);
    }
}
