public class CD extends DiscoBase implements Reproducir{
    public CD(String nombre, int capacidad,int velocidad){
        super(nombre, capacidad);
        this.velocidad=velocidad;
    }

    public String getTipoDisco(){
        return "CD";
    }

    public void reproducir(){
        System.out.println("El CD se está reproduciendo");
    }

    public void girar(int velocidad){
        System.out.println("Velocidad: "+velocidad);    
    }

}