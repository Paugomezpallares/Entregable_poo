public class Frisbee implements RotateDevice,TypeOfDevice{

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Frisbee(String name){
        this.name=name;
    }
    public Frisbee(){}


    @Override
    public void rotateDevice() {
        System.out.println("Rotating the Frisbee");
    }

    @Override
    public String getType() {
        return "Frisbee";
    }
}
