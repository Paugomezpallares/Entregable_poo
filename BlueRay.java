public class BlueRay extends BaseDisk implements PlayDisk, TypeOfDevice,RotateDevice{
    
    public BlueRay(String name, int capacity, int speed){
        super(name,capacity);
    }

    @Override
    public void play() {
        System.out.println("Playing the BlueRay at speed: " + speed);
    }
    @Override
    public void rotateDevice() {
        System.out.println("Rotating the CD");
    }

    @Override
    public String getType() {
        return "BlueRay";
    }

     
}