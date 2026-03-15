class EconomyRoom extends Room {
    public EconomyRoom(int roomNumber, int maxPersons, int pricePerNight) {
        super(roomNumber, maxPersons, pricePerNight);
    }

    public EconomyRoom(int roomNumber, int pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    public EconomyRoom() {
        super();
    }
}
