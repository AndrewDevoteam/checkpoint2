package test;

import domain.AutoMaker;
import domain.Vehicle;
import domain.VehicleRepository;
import domain.VehicleService;

import java.util.Scanner;

public class ApplicationClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AutoMaker gm = new AutoMaker("GM");
        Vehicle suburban = new Vehicle("Suburban", "Red", "1995", gm);
        Vehicle malibu = new Vehicle("Malibu", "Yellow", "2003", gm);
        Vehicle silverado = new Vehicle("Silverado", "Blue", "2007", gm);

        AutoMaker hyundai = new AutoMaker("Hyundai");
        Vehicle azera = new Vehicle("Azera", "Red", "2014", hyundai);
        Vehicle sonata = new Vehicle("Sonata", "Yellow", "2015", hyundai);
        Vehicle veloster = new Vehicle("Veloster", "Blue", "2009", hyundai);

        AutoMaker volksWagen = new AutoMaker("VolksWagen");
        Vehicle golf = new Vehicle("Golf", "Red", "1994", volksWagen);
        Vehicle jetta = new Vehicle("Jetta", "Yellow", "2017", volksWagen);
        Vehicle polo = new Vehicle("Polo", "Blue", "2000", volksWagen);

        AutoMaker audi = new AutoMaker("Audi");
        Vehicle a4 = new Vehicle("A4", "Red", "2001", audi);
        Vehicle q7 = new Vehicle("Q7", "Yellow", "2002", audi);
        Vehicle r8 = new Vehicle("R8", "Blue", "1999", audi);

        AutoMaker mercedes = new AutoMaker("Mercedes");
        Vehicle c180 = new Vehicle("C180", "Red", "2017", mercedes);
        Vehicle c200 = new Vehicle("C200", "Yellow", "2018", mercedes);
        Vehicle gLA200 = new Vehicle("GLA200", "Blue", "2019", mercedes);

        AutoMaker peugeot = new AutoMaker("Peugeot");
        Vehicle p206 = new Vehicle("206", "Red", "2006", peugeot);
        Vehicle p208 = new Vehicle("208", "Yellow", "2008", peugeot);
        Vehicle p2008 = new Vehicle("2008", "Blue", "2007", peugeot);

        Vehicle[] vehicleList = {
                suburban, malibu, silverado,
                azera, sonata, veloster,
                golf, polo, jetta,
                a4, q7, r8,
                c180, c200, gLA200,
                p206, p208, p2008
        };

        VehicleRepository vehicleRepository = new VehicleRepository(vehicleList);

        int continueOrNot = 1;
        while (continueOrNot != 0){
            System.out.println("----------------------");
            System.out.println("Please select an option");
            System.out.println("1. - Search by Automaker");
            System.out.println("2. - Search by Car Model");
            System.out.println("3. - Add a Vehicle");
            System.out.println("4. - Update a Vehicle");
            System.out.println("5. - Delete a Vehicle");
            int selectedOption = scanner.nextInt();

            switch (selectedOption){
                case 1 -> VehicleService.searchByAutoMaker(vehicleRepository);
                case 2 -> VehicleService.searchByModel(vehicleRepository);
                case 3 -> VehicleService.addVehicle();
                case 4 -> VehicleService.updateVehicle(vehicleRepository);
                case 5 -> VehicleService.deleteVehicleByModel(vehicleRepository);
                default -> System.out.println("Invalid input");
            }
            System.out.println("Do you wish to continue?");
            System.out.println("0. No");
            System.out.println("1. Yes");
            continueOrNot = scanner.nextInt();
        }
        System.out.println("Program Terminated");
    }
}
