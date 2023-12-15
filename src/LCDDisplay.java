public class LCDDisplay extends Display {
    // Attributes specific to LCDDisplay, e.g., screen size, resolution

    @Override
    public void showMessage(String message) {
        if (message == null) {
            System.out.println("Error: Null message cannot be displayed.");
            return;
        }
        // Optionally, add logic to handle very long messages or split them
        System.out.println("LCD Display: " + message);
    }

    @Override
    public void clearDisplay() {
        System.out.println("LCD Display cleared");
    }

}
