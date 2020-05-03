class Car extends Vehicle {
    private boolean airConditioningStatus;

    public Car(String name, double tankCapacity, double avgFuelConsumption) {
        super(name, tankCapacity, avgFuelConsumption);
        this.airConditioningStatus = false;
    }

    public boolean isAirConditioning() {
        return airConditioningStatus;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioningStatus = airConditioning;
    }

    public void turnOnAirConditioning() {
        if (!airConditioningStatus) {
            airConditioningStatus = true;
            setAvgFuelConsumption(getAvgFuelConsumption() + 0.8);
        }
    }

    public void turnOffAirConditioning() {
        if (airConditioningStatus) {
            airConditioningStatus = false;
            setAvgFuelConsumption(getAvgFuelConsumption() - 0.8);
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", klimatyzacja: " + showAirConditioningStatus();
    }

    private String showAirConditioningStatus() {
        if (airConditioningStatus)
            return "ON";
        else
            return "OFF";
    }
}
