class UltraLuxRoom extends LuxRoom {
    public UltraLuxRoom(int roomNumber, int maxPersons, int pricePerNight) {
        super(roomNumber, maxPersons, pricePerNight);
    }

    public UltraLuxRoom(int roomNumber, int pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    public UltraLuxRoom() {
        super();
    }
}
