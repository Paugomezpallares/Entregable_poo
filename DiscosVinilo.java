public class DiscosVinilo extends DiscoBase implements Giratorio{
    public DiscosVinilo(String nombre, int capacidad, int velocidad){
        super(nombre,capacidad);
    }

    @Override
    public void girar() {
        System.out.println("El Disco de Vinilo: "+nombre+", está girando");    
    }

}
