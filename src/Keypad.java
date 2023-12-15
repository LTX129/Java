public class Keypad implements SecurityDevice {
    private Display display;
    private String enteredNumber;
    private int failedAttempts = 0;
    private static final int MAX_ATTEMPTS = 3;
    private DoorLock doorLock;

    public Keypad(DoorLock doorLock) {
        this.doorLock = doorLock;
    }

    @Override
    public void handleInput(String input) {
        if (failedAttempts >= MAX_ATTEMPTS) {
            System.out.println("Keypad is locked due to too many failed attempts.");
            return;
        }

        // Process the input. For example, validate apartment number or PIN
        // and take appropriate actions based on the input type.
        if (isPinValid(input)) {
            failedAttempts++;
            System.out.println("Invalid input. Please try again.");
        } else {
            doorLock.handleInput("open");
            failedAttempts = 0; // Reset failed attempts if input is valid
        }

        if (failedAttempts >= MAX_ATTEMPTS) {
            System.out.println("Keypad is now locked due to too many failed attempts.");
            deactivate();
        }
    }

    public void activate() {
        // Logic to activate keypad
        display.showMessage("Keypad Activated");
    }

    @Override
    public void deactivate() {
        // Logic to deactivate keypad
        display.showMessage("Keypad Deactivated");
    }
    public void enterNumber(String number) {
        this.enteredNumber = number;
        // Display entered number
        display.showMessage("Number Entered: " + number);
    }
    private boolean isPinValid(String pin) {
        // Placeholder for PIN validation logic
        // For example, checking against a stored PIN
        String storedPin = "1234"; // Example stored PIN
        return storedPin.equals(pin);
    }

}
