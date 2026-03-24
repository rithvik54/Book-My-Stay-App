public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        System.out.println("BOOKING HISTORY DEMO");

        BookingHistory history = new BookingHistory();
        BookingReportService report = new BookingReportService();

        Reservation r1 = new Reservation("Rithvik", "Single");
        Reservation r2 = new Reservation("Kumar", "Double");
        Reservation r3 = new Reservation("Arjun", "Suite");

        history.addReservation(r1);
        history.addReservation(r2);
        history.addReservation(r3);

        report.generateReport(history);
    }
}