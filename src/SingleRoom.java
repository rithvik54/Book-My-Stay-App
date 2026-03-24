public class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 200, 1200);
    }

    @Override
    public void roomType() {
        System.out.println("Room Type: Single");
    }
}