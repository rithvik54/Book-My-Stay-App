import java.util.*;

public class RoomAllocationService {

    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService() {
        assignedRoomsByType = new HashMap<>();
    }

    public void allocateRoom(Reservation reservation,
                             RoomInventory inventory) {

        String roomType = reservation.getRoomType();

        Map<String, Integer> availability =
                inventory.getRoomAvailability();

        if (availability.get(roomType) <= 0) {
            System.out.println("No " + roomType +
                    " rooms available for " +
                    reservation.getGuestName());
            return;
        }

        String roomId = generateRoomId(roomType);

        assignedRoomsByType
                .computeIfAbsent(roomType,
                        k -> new HashSet<>())
                .add(roomId);

        // update inventory
        inventory.updateAvailability(
                roomType,
                availability.get(roomType) - 1);

        System.out.println("Room Allocated → "
                + reservation.getGuestName()
                + " | Type: " + roomType
                + " | Room ID: " + roomId);
    }

    private String generateRoomId(String roomType) {

        int count =
                assignedRoomsByType
                        .getOrDefault(roomType,
                                new HashSet<>())
                        .size() + 1;

        return roomType.substring(0,1)
                .toUpperCase() + count;
    }
}
