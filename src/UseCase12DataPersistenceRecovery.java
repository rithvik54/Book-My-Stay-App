public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("Data Persistence Demo");

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService service =
                new FilePersistenceService();

        String path = "inventory.txt";

        service.saveInventory(inventory, path);

        inventory.updateAvailability("Single", 0);

        service.loadInventory(inventory, path);

        System.out.println(inventory.getRoomAvailability());
    }
}