public class ICCardReader implements SecurityDevice {
    private DoorLock doorLock;

    public ICCardReader(DoorLock doorLock) {
        this.doorLock = doorLock;
    }

    @Override
    public void activate() {
        System.out.println("IC Card Reader activated.");
    }

    @Override
    public void deactivate() {
        System.out.println("IC Card Reader deactivated.");
    }

    public void handleInput(String cardData) {
        // Placeholder for card reading logic
        // For example, checking if cardData matches a valid card
        String validCardData = "valid_card_data"; // Example valid card data
        if (validCardData.equals(cardData)) {
            doorLock.handleInput("open");
            System.out.println("Card validated, door opened.");
        } else {
            System.out.println("Invalid card.");
        }
    }

    public void readCard(String cardData) {
        // Implement card reading logic
        // If card is valid, open the door
        doorLock.openDoor();
    }
}
