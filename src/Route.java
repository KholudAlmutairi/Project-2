class Route {
    String startAddress;
    String destinationAddress;
    double price;

    Route(String startAddress, String destinationAddress, double price) {
        this.startAddress = startAddress;
        this.destinationAddress = destinationAddress;
        this.price = price;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}