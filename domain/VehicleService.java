package domain;

import java.util.Scanner;

public class VehicleService {
    static Scanner scanner = new Scanner(System.in);

    private final VehicleRepository vehicleRepository = new VehicleRepository();

    public void searchByManufacturer(String manufacturerName) {
        for (int i = 0, k = 0; i < vehicleRepository.getVehicleList().length; i++) {
            if (vehicleRepository.getVehicleList()[i].getAutoMaker().getName().equalsIgnoreCase(manufacturerName)) {
                vehicleRepository.getVehicleList()[i].prettyPrint();
            }
        }
    }

    public void searchByModel(String modelName) {
        for (int i = 0, k = 0; i < vehicleRepository.getVehicleList().length; i++) {
            if (vehicleRepository.getVehicleList()[i].getModel().equalsIgnoreCase(modelName)) {
                vehicleRepository.getVehicleList()[i].prettyPrint();
            }
        }
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.addVehicleRepository(vehicle);
    }

    public void updateVehicle(Vehicle vehicleOld, Vehicle vehicleNew) {
        for (int i = 0; i < vehicleRepository.getVehicleList().length; i++) {
            if (vehicleRepository.getVehicleList()[i].getModel().equalsIgnoreCase(vehicleOld.getModel())){
                vehicleRepository.getVehicleList()[i].setModel(vehicleNew.getModel());
                vehicleRepository.getVehicleList()[i].setColor(vehicleNew.getColor());
                vehicleRepository.getVehicleList()[i].setYear(vehicleNew.getYear());
                vehicleRepository.getVehicleList()[i].setAutoMaker(vehicleNew.getAutoMaker());
            }
        }
    }

    public void deleteVehicleByModel(String deleteVehicle) {
        for (Vehicle vehicle : vehicleRepository.getVehicleList()) {
            if (vehicle.getModel().equalsIgnoreCase(deleteVehicle)) {
                vehicleRepository.updatedVehicleRepository(vehicle);
            }
        }
    }
}
