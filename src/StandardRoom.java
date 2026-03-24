public class StandardRoom extends Room {

    public StandardRoom() {
        super(1, 250, 1500);
    }

    @Override
    public void roomType() {
        System.out.println("Room Type: Standard");
    }
}