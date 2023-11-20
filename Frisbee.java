public class Frisbee implements Giratorio{

    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Frisbee(String nombre){
        this.nombre=nombre;
    }
    public Frisbee(){}

    @Override
    public void girar() {
        System.out.println("El Frisbee está girando");    
    }
    
}
