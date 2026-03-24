public class UseCase3InventorySetup {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        System.out.println("===== ROOM INVENTORY STATUS =====");

        for (String type : inventory.getRoomAvailability().keySet()) {

            System.out.println(type + " Rooms Available: "
                    + inventory.getRoomAvailability().get(type));
        }

        // update example
        inventory.updateAvailability("Deluxe", 4);

        System.out.println("\nAfter Update:");

        System.out.println("Deluxe Rooms Available: "
                + inventory.getRoomAvailability().get("Deluxe"));
    }
}