import java.util.*;

public class BookingReportService {

    public void generateReport(BookingHistory history) {

        System.out.println("\n===== BOOKING REPORT =====");

        List<Reservation> list = history.getConfirmedReservations();

        if (list.isEmpty()) {
            System.out.println("No confirmed bookings.");
            return;
        }

        for (Reservation r : list) {
            System.out.println(
                    "Guest : " + r.getGuestName() +
                            " | Room : " + r.getRoomType()
            );
        }

        System.out.println("==========================");
    }
}