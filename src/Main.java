public class Main {
    public static void main(String[] args) {
        EconomyRoom ecoRoom = new EconomyRoom(101, 2, 80);
        StandartRoom stdRoom = new StandartRoom(201, 150);
        LuxRoom luxRoom = new LuxRoom(301, 3, 250);
        UltraLuxRoom ultraLux = new UltraLuxRoom(401, 500);

        HotelRoomService service = new HotelRoomService();

        System.out.println("--- Тест EconomyRoom ---");
        System.out.println(ecoRoom);
        service.reserve(ecoRoom);
        System.out.println(ecoRoom);
        try {
            service.reserve(ecoRoom);
        } catch (RoomAlreadyBookedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        service.free(ecoRoom);
        System.out.println(ecoRoom);

        System.out.println("\n--- Тест StandartRoom ---");
        System.out.println(stdRoom);
        service.reserve(stdRoom);
        System.out.println(stdRoom);
        service.free(stdRoom);
        System.out.println(stdRoom);

        System.out.println("\n--- Тест LuxRoom ---");
        System.out.println(luxRoom);
        service.reserve(luxRoom);
        System.out.println(luxRoom);
        service.free(luxRoom);
        System.out.println(luxRoom);

        System.out.println("\n--- Тест UltraLuxRoom ---");
        System.out.println(ultraLux);
        service.reserve(ultraLux);
        System.out.println(ultraLux);
        service.free(ultraLux);
        System.out.println(ultraLux);
    }
}
