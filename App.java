public class App {
    public static void main(String[] args) {
        CD cd=new CD("My CD",250,80);
        System.out.println("The name of the CD: "+cd.getName());
        System.out.println("The capacity is: "+cd.getCapacity());

        cd.play();

        String[] arrayInfoCD=new String[5];
        arrayInfoCD[0]=cd.storeInformationDisc("data", arrayInfoCD);
        arrayInfoCD[1]=cd.storeInformationDisc("data2", arrayInfoCD);

        cd.readInformationDisc(arrayInfoCD);

        System.out.println(cd.toString());

        System.out.println("\n");
        System.out.println("\n");

        DVD dvd=new DVD("My DVD",250,80);
        dvd.setSpeed(50);
        System.out.println("Name of the DVD: "+dvd.getName());
        System.out.println("The capacity is: "+dvd.getCapacity());

        cd.play();

        String[] arrayInfoDVD=new String[5];
        arrayInfoDVD[0]=cd.storeInformationDisc("datosDVD", arrayInfoDVD);
        arrayInfoDVD[1]=cd.storeInformationDisc("datos2DVD", arrayInfoDVD);

        dvd.readInformationDisc(arrayInfoDVD);

        System.out.println(dvd.toString());
        System.out.println("\n");

        Frisbee fris=new Frisbee("Fris");
        fris.rotateDevice();
        System.out.println("Is a: "+fris.getType());

        System.out.println("\n");

        Wheel wheel1=new Wheel("Wheel1");
        wheel1.rotateDevice();
        System.out.println("Is a: "+wheel1.getType());

        
    }
}
