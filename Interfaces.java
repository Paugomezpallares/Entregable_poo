interface ReadInformation {
    void readInformationDisc(String[] a); 
}

interface StoreInformation {
    String storeInformationDisc(String datos,String[] a);   
}

interface PlayDisk {
    void play();
}

interface RotateDevice{
    void rotateDevice();
}
interface TypeOfDevice {
    String getType();
}