public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation System");

        RoomInventory inventory = new RoomInventory();
        CancellationService cancelService = new CancellationService();

        // register bookings
        cancelService.registerBooking("R101", "Single");
        cancelService.registerBooking("R102", "Double");

        // cancel booking
        cancelService.cancelBooking("R101", inventory);
        cancelService.cancelBooking("R102", inventory);

        // show rollback
        cancelService.showRollbackHistory();
    }
}