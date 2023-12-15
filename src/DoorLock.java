public class DoorLock implements SecurityDevice {
    private Keypad keypad;
    private boolean isLocked;

    public DoorLock(Keypad keypad) {
        this.keypad = keypad;
        this.isLocked = true;
    }

    @Override
    public void activate() {
        // Logic to activate door lock
        keypad.activate();
    }

    @Override
    public void deactivate() {
        // Logic to deactivate door lock
        keypad.deactivate();
    }

    @Override
    public void handleInput(String input) {
        if (input.equals("open")) {
            System.out.println("Door opened.");
        }
    }

    public void openDoor() {
        this.isLocked = false;
        // Logic to open the door
    }

    // Other methods...
}
