class NonSubscriberPassenger extends Passenger {
    boolean discountCoupon;

    NonSubscriberPassenger(String name, String ID, boolean discountCoupon) {
        super(name, ID);
        this.discountCoupon=discountCoupon;
    }

    public NonSubscriberPassenger(String name, String ID, Car reservedCar, double tripCost, boolean discountCoupon) {
        super(name, ID, reservedCar, tripCost);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    @Override
    void reserveCar(Car car) {
        if (car.maxCapacity == 0) {
            throw new IllegalArgumentException("Maximum capacity of the car is zero");
        }
        reservedCar = car;
        calculateTripCost();
    }
}