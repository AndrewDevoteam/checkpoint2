package domain;

import java.util.Scanner;

public class VehicleService {
    static Scanner scanner = new Scanner(System.in);

    public static void searchByAutoMaker(VehicleRepository vehicleRepository) {
        System.out.println("Please type in the name of an automaker");
        String selectedAutoMaker = scanner.next();
        for (Vehicle vehicle : vehicleRepository.getVehicleList()) {
            if (vehicle.getAutoMaker().getName().equalsIgnoreCase(selectedAutoMaker)) {
                System.out.println("Manufacturer " + vehicle.getAutoMaker().getName());
                System.out.println("Model " + vehicle.getModel());
                System.out.println("Year " + vehicle.getYear());
                System.out.println("Color " + vehicle.getColor());
                System.out.println("-----------------");
            }
        }
    }

    public static void searchByModel(VehicleRepository vehicleRepository) {
        System.out.println("Please type in the name of the car model");
        String selectedModel = scanner.next();
        for (Vehicle vehicle : vehicleRepository.getVehicleList()) {
            if (vehicle.getModel().equalsIgnoreCase(selectedModel)) {
                System.out.println("Model " + vehicle.getModel());
                System.out.println("Color " + vehicle.getColor());
                System.out.println("Year " + vehicle.getYear());
                System.out.println("Manufacturer " + vehicle.getAutoMaker().getName());
                System.out.println("------------");
            }
        }
    }

    public static void addVehicle() {

        System.out.println("Please type in the name of the vehicle");
        String name = scanner.next();
        System.out.println("Please type in the year of production of the vehicle");
        String year = scanner.next();
        System.out.println("Please type in the color of the vehicle");
        String color = scanner.next();
        System.out.println("Please type in the automaker of the vehicle");
        String autoMaker = scanner.next();
        AutoMaker automaker = new AutoMaker(autoMaker);
        Vehicle vehicle = new Vehicle(name, color, year, automaker);
        VehicleRepository.addVehicle(vehicle);

    }

    public static void updateVehicle(VehicleRepository vehicleRepository) {

        System.out.println("Please type in the name of the vehicle to update");
        String selectedVehicle = scanner.next();
        for (Vehicle vehicle : vehicleRepository.getVehicleList()) {
            if (vehicle.getModel().equalsIgnoreCase(selectedVehicle)) {
                System.out.println("Please type in the updated vehicle name ");
                String updatedName = scanner.next();
                System.out.println("Please type in the updated year of Production ");
                String updatedYear = scanner.next();
                System.out.println("Please type in the update color ");
                String updatedColor = scanner.next();
                System.out.println("Please type in the update name of the automaker ");
                String updatedManufacturer = scanner.next();
                vehicle.setModel(updatedName);
                vehicle.setYear(updatedYear);
                vehicle.setColor(updatedColor);
                AutoMaker autoMaker = new AutoMaker(updatedManufacturer);
                vehicle.setAutoMaker(autoMaker);
            }
        }
    }

    public static void deleteVehicleByModel(VehicleRepository vehicleRepository) {
        System.out.println("Please type in the name of the vehicle you want to delete");
        String vehicleName = scanner.next();
        for (Vehicle vehicle : vehicleRepository.getVehicleList()) {
            if (vehicle.getModel().equalsIgnoreCase(vehicleName)) {
                VehicleRepository.updatedVehicleRepository(vehicle);
            }
        }
    }
}
