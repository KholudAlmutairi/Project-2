public abstract class Passenger {
    String name;
    String ID;
    Car reservedCar;
    double tripCost;

    Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public Passenger(String name, String ID, Car reservedCar, double tripCost) {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;
        this.tripCost = tripCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    abstract void reserveCar(Car car);

    void calculateTripCost() {
        double routePrice = reservedCar.route.price;
        if (this instanceof SubscriberPassenger) {
            tripCost = routePrice * 0.5;
        } else if (this instanceof NonSubscriberPassenger) {
            NonSubscriberPassenger nonSubPassenger = (NonSubscriberPassenger) this;
            if (nonSubPassenger.discountCoupon) {
                tripCost = routePrice * 0.9;
            } else {
                tripCost = routePrice;
            }
        } else {
            tripCost = routePrice;
        }
    }

    void displayInfo() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger ID: " + ID);
        System.out.println("Reserved Car Code:"+reservedCar.code);
        System.out.println("Trip Cost: " + tripCost);
    }
}