public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("===== ADD-ON SERVICE SELECTION =====");

        AddOnServiceManager manager = new AddOnServiceManager();

        String reservationId = "R101";

        AddOnService breakfast = new AddOnService("Breakfast", 500);
        AddOnService spa = new AddOnService("Spa", 1500);
        AddOnService pickup = new AddOnService("Airport Pickup", 800);

        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);
        manager.addService(reservationId, pickup);

        double total = manager.calculateTotalServiceCost(reservationId);

        System.out.println("Total Add-on Cost = " + total);
    }
}