class Truck extends Car {
    private double loadWeight;

    public Truck(String name, double tankCapacity, double avgFuelConsumption, double loadWeight) {
        super(name, tankCapacity, avgFuelConsumption);
        this.loadWeight = loadWeight;
    }

    public void turnOnAirConditioning() {
        if (!isAirConditioning()) {
            setAirConditioning(true);
            setAvgFuelConsumption(getAvgFuelConsumption() + 1.6);
        }
    }

    public void increaseLoad() {
        loadWeight += 100;
        setAvgFuelConsumption(getAvgFuelConsumption() + 0.5);
    }

    public void decreaseLoad() {
        loadWeight -= 100;
        setAvgFuelConsumption(getAvgFuelConsumption() - 0.5);
    }

    public void turnOffAirConditioning() {
        if (isAirConditioning()) {
            setAirConditioning(false);
            setAvgFuelConsumption(getAvgFuelConsumption() - 1.6);
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", waga ładunku: " + loadWeight;
    }
}
