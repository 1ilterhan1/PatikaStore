import java.util.Scanner;

public abstract class Products { // products abstract classimi olusturuyorum
    int id; //primary id no
    int urunno; //urunun no
    float price; //fiyat
    float salePer; //indirim orani
    int stok; //stok miktari
    String name; //urun adi
    int brand; //marka adi
    int memory; //hafiza bilgisiz
    float ScreenSize; //ekran inc cinsinden
    int ram; //ram bilgisi

    public Products(int id, int urunno, float price, float salePer, int stok, String name, int brand, int memory, float screenSize, int ram) {
        this.id = id;
        this.urunno = urunno;
        this.price = price;
        this.salePer = salePer;
        this.stok = stok;
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        ScreenSize = screenSize;
        this.ram = ram;
    }

    /*
    1-Kullanıcı sistem üzerinden ilgili kategorideki (Notebook, Cep Telefonları vb.) ürünleri listeyebilimeli
    2-Ürünler listelenirken tablo şeklinde konsol ekranında gösterilmeli (System.out.format() kullanılabilir).
    3-Kullanıcı ürün ekleyebilmeli ve ürünün grubunu (Cep Telefonu, Notebook vb.) seçebilmeli.
    4-Kullanıcı ürünleri benzersiz numaralarına göre silebilmeli.
    5-Kullanıcı ürünlerin benzersiz numaralarına ve markalarına göre filtreleyip listeleyebilmeli.
     */


}
