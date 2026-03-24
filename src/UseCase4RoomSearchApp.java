public class UseCase4RoomSearchApp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        RoomSearchService service = new RoomSearchService();

        service.searchAvailableRooms(
                inventory,
                single,
                dbl,
                suite);
    }
}