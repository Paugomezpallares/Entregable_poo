public class DVD extends DiscoBase implements Reproducir{
    public DVD(String nombre, int capacidad, int velocidad){
        super(nombre,capacidad);
    }

    public String getTipoDisco(){
        return "DVD";
    }

    public void reproducir(){
        System.out.println("El DVD se está reproduciendo");
    }

    public void girar(){
        System.out.println("El DVD: "+nombre+", está girando");    
    }
     
}
