abstract class ProRoom extends Room {
    public ProRoom(int roomNumber, int maxPersons, int pricePerNight) {
        super(roomNumber, maxPersons, pricePerNight);
    }

    public ProRoom(int roomNumber, int pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    public ProRoom() {
        super();
    }
}
