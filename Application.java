import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String carMatrix[][] = new String[6][4];
        Scanner keyboard = new Scanner(System.in);
        carMatrix[0][0] = "GM";
        carMatrix[0][1] = "Suburban";
        carMatrix[0][2] = "Malibu";
        carMatrix[0][3] = "Silverado";
        carMatrix[1][0] = "Hyundai";
        carMatrix[1][1] = "Azera";
        carMatrix[1][2] = "Sonata";
        carMatrix[1][3] = "Veloster";
        carMatrix[2][0] = "Volkswagen";
        carMatrix[2][1] = "Golf";
        carMatrix[2][2] = "Jetta";
        carMatrix[2][3] = "Polo";
        carMatrix[3][0] = "Audi";
        carMatrix[3][1] = "A4";
        carMatrix[3][2] = "Q7";
        carMatrix[3][3] = "R8";
        carMatrix[4][0] = "Mercedes";
        carMatrix[4][1] = "C 180";
        carMatrix[4][2] = "C 200";
        carMatrix[4][3] = "GLA 200";
        carMatrix[5][0] = "Peugeot";
        carMatrix[5][1] = "206";
        carMatrix[5][2] = "208";
        carMatrix[5][3] = "2008";
        int continueOrNot = 1;


        while (continueOrNot != 0) {
            System.out.println("Please select a car brand to see the available vehicles");
            for (int i = 0; i < 6; i++) {
                System.out.println((i + 1) + " - " + carMatrix[i][0]);
            }
            System.out.println("0 - Exit");
            int selectedValue = keyboard.nextInt();
            switch (selectedValue) {
                case 1, 2, 3, 4, 5, 6 -> {
                    System.out.println("Available Cars");
                    for (int j = 0; j < carMatrix[selectedValue - 1].length; j++) {
                        System.out.println(carMatrix[selectedValue - 1][j]);
                    }
                }
                default -> System.out.println("Invalid input");
            }
            System.out.println("Do you wish to continue?");
            System.out.println("0. No");
            System.out.println("1. Yes");
            continueOrNot = keyboard.nextInt();
        }
        System.out.println("Program Terminated");
    }
}
