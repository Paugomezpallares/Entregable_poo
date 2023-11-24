public class CD extends BaseDisk implements ReadInformation, StoreInformation, PlayDisk, RotateDevice, TypeOfDevice {
    public CD(String name, int capacity, int speed) {
        super(name, capacity);
        this.speed = speed;
    }

    @Override
    public void rotateDevice() {
        System.out.println("Rotating the CD");
    }

    @Override
    public void play() {
        System.out.println("Playing the CD at speed: " + speed);
    }

    @Override
    public String storeInformationDisc(String data, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = data;
                break;
            }
        }

        System.out.println("Information stored successfully");
        return data;
    }

    @Override
    public void readInformationDisc(String[] array) {
        System.out.println("Stored information:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i]);
            }
        }
    }

    @Override
    public String getType() {
        return "CD";
    }

}