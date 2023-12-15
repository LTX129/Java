public class SecureApartment {
    private LCDDisplay lcdDisplay;
    private DoorLock doorLock;
    private ICCardReader icCardReader;
    private Keypad keyPad;
    private VideoCallSystem videoCallSystem;

    public SecureApartment() {
        this.doorLock = new DoorLock(keyPad);
        this.lcdDisplay = new LCDDisplay();
        this.icCardReader = new ICCardReader(doorLock);
        this.keyPad = new Keypad(doorLock);
        this.videoCallSystem = new VideoCallSystem(lcdDisplay,doorLock);
    }

    public void activateSystem() {
        doorLock.activate();
        icCardReader.activate();
        keyPad.activate();
        videoCallSystem.activate();
    }

    public void deactivateSystem() {
        doorLock.deactivate();
        icCardReader.deactivate();
        keyPad.deactivate();
        videoCallSystem.deactivate();
    }

    // Other methods as required...
}
