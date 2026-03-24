public class UseCase6RoomAllocation {

    public static void main(String[] args) {

        System.out.println("===== ROOM ALLOCATION SYSTEM =====");

        RoomInventory inventory = new RoomInventory();

        BookingRequestQueue queue =
                new BookingRequestQueue();

        RoomAllocationService service =
                new RoomAllocationService();

        queue.addRequest(new Reservation("Abhi","Single"));
        queue.addRequest(new Reservation("Subha","Double"));
        queue.addRequest(new Reservation("Kiran","Suite"));
        queue.addRequest(new Reservation("Ravi","Single"));

        while (queue.hasPendingRequests()) {

            Reservation r =
                    queue.getNextRequest();

            service.allocateRoom(r, inventory);
        }
    }
}