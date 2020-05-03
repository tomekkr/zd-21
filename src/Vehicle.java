class Vehicle {
    private String name;
    private double tankCapacity;
    private double avgFuelConsumption;

    public Vehicle(String name, double tankCapacity, double avgFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.avgFuelConsumption = avgFuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getAvgFuelConsumption() {
        return avgFuelConsumption;
    }

    public void setAvgFuelConsumption(double avgFuelConsumption) {
        this.avgFuelConsumption = avgFuelConsumption;
    }

    public String getInfo() {
        return name + ", pojemność baku: " + tankCapacity + ", średnie spalanie: " + avgFuelConsumption;
    }
}
