class SubscriberPassenger extends Passenger {
    SubscriberPassenger(String name, String ID) {
        super(name, ID);
    }

    public SubscriberPassenger(String name, String ID, Car reservedCar, double tripCost) {
        super(name, ID, reservedCar, tripCost);
    }

    @Override
    void reserveCar(Car car) {
        reservedCar = car;
        calculateTripCost();
    }
}