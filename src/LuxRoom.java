class LuxRoom extends ProRoom {
    public LuxRoom(int roomNumber, int maxPersons, int pricePerNight) {
        super(roomNumber, maxPersons, pricePerNight);
    }

    public LuxRoom(int roomNumber, int pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    public LuxRoom() {
        super();
    }
}
