class HotelRoomService implements RoomService<Room> {
    @Override
    public void clean(Room room) {
        System.out.println("Комната " + room.getRoomNumber() + " убрана.");
    }

    @Override
    public void reserve(Room room) {
        if (room.isBooked()) {
            throw new RoomAlreadyBookedException("Комната " + room.getRoomNumber() + " уже забронирована!");
        }
        room.setBooked(true);
        System.out.println("Комната " + room.getRoomNumber() + " зарезервирована.");
    }

    @Override
    public void free(Room room) {
        room.setBooked(false);
        System.out.println("Комната " + room.getRoomNumber() + " освобождена.");
    }
}