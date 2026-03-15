abstract class Room {
    protected int roomNumber;
    protected int maxPersons;
    protected int pricePerNight;
    protected boolean booked;

    public Room(int roomNumber, int maxPersons, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.maxPersons = maxPersons;
        this.pricePerNight = pricePerNight;
        this.booked = false;
    }

    public Room(int roomNumber, int pricePerNight) {
        this(roomNumber, (int)(Math.random() * 4) + 1, pricePerNight);
    }

    public Room() {
        this(100 + (int)(Math.random() * 100), 50 + (int)(Math.random() * 150));
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "номер=" + roomNumber +
                ", макс. человек=" + maxPersons +
                ", цена=" + pricePerNight +
                ", забронирована=" + booked +
                '}';
    }
}