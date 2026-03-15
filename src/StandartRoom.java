class StandartRoom extends ProRoom {
    public StandartRoom(int roomNumber, int maxPersons, int pricePerNight) {
        super(roomNumber, maxPersons, pricePerNight);
    }

    public StandartRoom(int roomNumber, int pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    public StandartRoom() {
        super();
    }
}
