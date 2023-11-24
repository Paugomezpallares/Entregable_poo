public class VinylRecord extends BaseDisk implements PlayDisk, TypeOfDevice,RotateDevice{
    public VinylRecord(String name, int capacity, int speed){
        super(name,capacity);
    }

    @Override
    public void play() {
        System.out.println("Playing the vinyl at speed: " + speed);
    }
    @Override
    public String getType() {
        return "vinyl";
    }

    @Override
    public void rotateDevice() {
        System.out.println("Rotating the vinyl");
    }
}
