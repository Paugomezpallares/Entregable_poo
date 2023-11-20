public class Rueda implements Giratorio{

    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rueda(String nombre){
        this.nombre=nombre;
    }

    public Rueda(){}

    @Override
    public void girar() {
        System.out.println("La rueda está girando");    
    }
}
