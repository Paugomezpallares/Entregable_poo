public class BlueRay extends DiscoBase implements Giratorio{
    
    public BlueRay(String nombre, int capacidad, int velocidad){
        super(nombre,capacidad);
    }

    @Override
    public void girar() {
        System.out.println("El Disco de Vinilo: "+nombre+", está girando");    
    }

     
}