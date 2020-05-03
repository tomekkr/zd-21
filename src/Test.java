class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Renault Clio", 40, 5.0),
                new Car("Toyota Camry", 70, 7.0),
                new Truck("Scania R560", 500, 40.0, 18000),
                new Truck("Volvo FH12", 350, 35.0, 16200)
        };

        VehicleUtils.printInfo(vehicles);
        VehicleUtils.turnOnAirConditioningInAllVehicles(vehicles);
        System.out.println("\nPo włączeniu klimatyzacji: ");
        VehicleUtils.printInfo(vehicles);
    }
}
