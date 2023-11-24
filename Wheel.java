public class Wheel implements RotateDevice,TypeOfDevice{

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wheel(String name){
        this.name=name;
    }

    public Wheel(){}

    @Override
    public void rotateDevice() {
        System.out.println("Rotating the wheel");
    }
    @Override
    public String getType() {
        return "Wheel";
    }
}
