public class App {
    public static void main(String[] args) {
        CD cd=new CD("MI CD",250,80);
        System.out.println("Nombre del CD: "+cd.getNombre());
        System.out.println("La capacidad es: "+cd.getCapacidad());

        cd.girar(30);

        String[] arrayDatos=new String[5];
        arrayDatos[0]=cd.almacenarDatosLaser("datos", arrayDatos);
        arrayDatos[1]=cd.almacenarDatosLaser("datos2", arrayDatos);

        cd.leerInformacionDisco(arrayDatos);

        System.out.println(cd.toString());

        System.out.println("\n");

        DVD dvd=new DVD("MI DVD",250,80);
        System.out.println("Nombre del DVD: "+dvd.getNombre());
        System.out.println("La capacidad es: "+dvd.getCapacidad());

        cd.girar(30);

        String[] arrayDatosDVD=new String[5];
        arrayDatosDVD[0]=cd.almacenarDatosLaser("datosDVD", arrayDatosDVD);
        arrayDatosDVD[1]=cd.almacenarDatosLaser("datos2DVD", arrayDatos);

        dvd.leerInformacionDisco(arrayDatosDVD);

        System.out.println(dvd.toString());
        
    }
}
