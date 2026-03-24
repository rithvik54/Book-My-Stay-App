public class SuiteRoom extends Room {

    public SuiteRoom() {
        super(3, 600, 5000);
    }

    @Override
    public void roomType() {
        System.out.println("Room Type: Suite");
    }
}
