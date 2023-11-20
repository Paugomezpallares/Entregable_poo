public class DiscoBase {
    protected  String nombre;
    protected  int capacidad;
    protected  int velocidad;
    

    public DiscoBase(String nombre,int capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
    }

    public DiscoBase(){}

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    };

    public String toString(){
        return "La información de: "+nombre+", capacidad: "+capacidad+", velocidad: "+velocidad;
    }


    public void girar(int velocidad) {
        System.out.println("El disco: "+nombre+", está girando a:"+velocidad);    
    }

    public String almacenarDatosLaser(String datos,String[] a) {
        for(int i=0;i<a.length;i++){
            if(a[i]==null){
                a[i]=datos;
                break;//i=a.length¿break; se podría utilizar?
            }
        }
        /*
            Para ver que se introducen correctamente
            for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/
        System.out.println("Información almacenada correctamente");
        return datos;
    }

    public void leerInformacionDisco(String[] a) {
        
        System.out.println("Información almacenada:");
        for(int i=0;i<a.length;i++){
            if(a[i]!=null){
                System.out.println(a[i]);
            }
        }
        
    }
}
