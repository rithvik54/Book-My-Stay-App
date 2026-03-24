import java.util.Map;

public class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability =
                inventory.getRoomAvailability();

        System.out.println("===== AVAILABLE ROOMS =====");

        // Single
        if (availability.get("Single") > 0) {
            System.out.println("\nSingle Room Available: "
                    + availability.get("Single"));
            singleRoom.roomType();
            singleRoom.displayRoomDetails();
        }

        // Double
        if (availability.get("Double") > 0) {
            System.out.println("\nDouble Room Available: "
                    + availability.get("Double"));
            doubleRoom.roomType();
            doubleRoom.displayRoomDetails();
        }

        // Suite
        if (availability.get("Suite") > 0) {
            System.out.println("\nSuite Room Available: "
                    + availability.get("Suite"));
            suiteRoom.roomType();
            suiteRoom.displayRoomDetails();
        }
    }
}