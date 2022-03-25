package domain;

public class VehicleRepository {

    private static Vehicle[] vehicleList;

    public VehicleRepository(Vehicle[] vehicleList) {
        this.vehicleList = vehicleList;
    }

    public static void newVehicleRepository(int n, Vehicle[] Vehicle, Vehicle vehicle) {
        int i;
        Vehicle newVehicleList[] = new Vehicle[vehicleList.length + 1];
        for (i = 0; i < vehicleList.length; i++)
            newVehicleList[i] = vehicleList[i];
        newVehicleList[vehicleList.length] = vehicle;
        vehicleList = newVehicleList;
    }

    public static void addVehicle(Vehicle vehicle) {
        newVehicleRepository(vehicleList.length, vehicleList, vehicle);
    }

    public static void updatedVehicleRepository(Vehicle vehicle) {
        Vehicle[] newVehicleList = new Vehicle[vehicleList.length - 1];
        for (int i = 0, k = 0; i < vehicleList.length; i++) {
            if (vehicleList[i].getModel().equalsIgnoreCase(vehicle.getModel())) {
                continue;
            }
            newVehicleList[k++] = vehicleList[i];
        }
        vehicleList = newVehicleList;
    }

    public static Vehicle[] getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(Vehicle[] vehicleList) {
        this.vehicleList = vehicleList;
    }
}
