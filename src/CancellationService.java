import java.util.*;

public class CancellationService {

    // stack to maintain rollback order
    private Stack<String> cancelledHistory;

    // map to store reservationId → roomType
    private Map<String, String> bookingData;

    public CancellationService() {
        cancelledHistory = new Stack<>();
        bookingData = new HashMap<>();
    }

    // register confirmed booking
    public void registerBooking(String reservationId, String roomType) {
        bookingData.put(reservationId, roomType);
    }

    // cancel booking
    public void cancelBooking(String reservationId, RoomInventory inventory) {

        if (!bookingData.containsKey(reservationId)) {
            System.out.println("Invalid Reservation ID");
            return;
        }

        String roomType = bookingData.get(reservationId);

        // restore inventory
        Map<String, Integer> availability = inventory.getRoomAvailability();
        availability.put(roomType, availability.get(roomType) + 1);

        cancelledHistory.push(reservationId);
        bookingData.remove(reservationId);

        System.out.println("Booking Cancelled for ID: " + reservationId);
    }

    // show rollback history
    public void showRollbackHistory() {
        System.out.println("\nCancellation History (Latest First)");

        while (!cancelledHistory.isEmpty()) {
            System.out.println(cancelledHistory.pop());
        }
    }
}
