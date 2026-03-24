public class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 350, 2200);
    }

    @Override
    public void roomType() {
        System.out.println("Room Type: Double");
    }
}