class VehicleUtils {
    private static double calculateRange(Vehicle vehicle) {
        return vehicle.getTankCapacity() / vehicle.getAvgFuelConsumption() * 100;
    }

    public static void printInfo(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getInfo() + ", zasięg: " + calculateRange(vehicle));
        }
    }

    public static void turnOnAirConditioningInAllVehicles(Vehicle[] vehicles) {
        turnOnAirConditioningInAllCars(vehicles);
        turnOnAirConditioningInAllTrucks(vehicles);
    }

    public static void turnOffAirConditioningInAllVehicles(Vehicle[] vehicles) {
        turnOffAirConditioningInAllCars(vehicles);
        turnOffAirConditioningInAllTrucks(vehicles);
    }

    public static void increaseLoadInAllTrucks(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                ((Truck) vehicle).increaseLoad();
            }
        }
    }

    public static void decreaseLoadInAllTrucks(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                ((Truck) vehicle).decreaseLoad();
            }
        }
    }

    private static void turnOnAirConditioningInAllCars(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                ((Car) vehicle).turnOnAirConditioning();
            }
        }
    }

    private static void turnOffAirConditioningInAllCars(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                ((Car) vehicle).turnOffAirConditioning();
            }
        }
    }

    private static void turnOnAirConditioningInAllTrucks(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                ((Truck) vehicle).turnOnAirConditioning();
            }
        }
    }

    private static void turnOffAirConditioningInAllTrucks(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                ((Truck) vehicle).turnOffAirConditioning();
            }
        }
    }
}
