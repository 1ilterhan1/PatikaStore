import java.util.Scanner;

public class phone extends Products{
    String renk;
    int battery; //pil gucu

    public phone( int id, int urunno, float price, float salePer, int stok, String name,int brand, int memory, float screenSize, int ram, String renk, int battery) {
        super( id, urunno, price, salePer, stok, name, brand, memory, screenSize, ram);
        this.renk = renk;
        this.battery = battery;
    }

}
