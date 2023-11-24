public class BaseDisk {
    protected  String name;
    protected  int capacity;
    protected  int speed;
    

    public BaseDisk(String name, int capacity){
        this.name=name;
        this.capacity=capacity;
    }

    public BaseDisk(){}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    };

    public String toString(){
        return "Information of : "+name+", capacity: "+capacity+", speed: "+speed;
    }

}
