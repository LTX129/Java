public class VideoCallSystem implements SecurityDevice{
    private Display display;
    private DoorLock door;
    private boolean inCall = false;
    private static final int TIMEOUT_PERIOD = 30; // seconds

    public VideoCallSystem(Display display, DoorLock door) {
        this.display = display;
        this.door = door;
    }

    public void initiateCall(String apartmentNumber) {
        inCall = true;
        // Simulate call initiation logic
        display.showMessage("Calling apartment " + apartmentNumber + "...");
        // Here, you would implement a timer to handle the timeout
    }

    public void hangUp() {
        inCall = false;
        display.showMessage("Call ended.");
    }

    public void openDoor() {
        if (inCall) {
            door.openDoor();
            display.showMessage("Door opened.");
        } else {
            display.showMessage("No active call to open door.");
        }
    }

    @Override
    public void activate() {
        display.showMessage("Video Call System activated.");
    }

    @Override
    public void deactivate() {
        display.showMessage("Video Call System deactivated.");
    }

    public void handleInput(String cardData) {
        // Placeholder for card reading logic
        // For example, checking if cardData matches a valid card
        String validCardData = "valid_card_data"; // Example valid card data
        if (validCardData.equals(cardData)) {
            door.handleInput("open");
            System.out.println("Card validated, door opened.");
        } else {
            System.out.println("Invalid card.");
        }
}
}
