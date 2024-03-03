
public class Main {
    public static void main(String[] args) {

        //----Routes-----//
        Route r1=new Route("Sa1-01","Da1-02",70);
        Route r2=new Route("Sa2-01","Da2-02",80);
       // Route r3=new Route("Sa3-03","Da3-02",80);

        //----Cars-----//
        Car c1=new Car("Code1",r1,0);
        Car c2=new Car("Code2",r2,5);
       // Car c3=new Car("Code2",r3,5);

        //Create an array of Passengers containing 1 Subscriber and 1 non-Subscriber.//
        Passenger[] passengers = {new SubscriberPassenger("Subscriber", "111"),
                                  new NonSubscriberPassenger("Non-Subscriber", "222", true)};

        for (Passenger passenger : passengers) {
            try {
                if (passenger instanceof NonSubscriberPassenger) {
                    passenger.reserveCar(c2);
                } else {
                    passenger.reserveCar(c1);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NullPointerException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
//

        for (Passenger p : passengers) {
            p.displayInfo();
            System.out.println();
        }
    }
}
