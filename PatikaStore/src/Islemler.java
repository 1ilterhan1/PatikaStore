import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    final String uyari = "Gecerli Deger Giriniz...";
    static int idler = 0;
    static List<computer> computerList = new ArrayList<>(); //urunlerimi tuttugum computer listesi
    static List<phone> phoneList = new ArrayList<>(); //ve urunlerimi tuttugum phone listem
    Scanner scan = new Scanner(System.in);
    public void addPhone(){ // telefon ekleme
        int id; // markanin
        int urunno=idler;
        String name2;
        idler++;
        try {
            System.out.print("urunun adini giriniz: ");
            name2 = scan.nextLine();

            System.out.print("Urunun Rengini Giriniz: ");
            String color = scan.nextLine();

            System.out.print("urun fiyatini giriniz: ");
            float price = Float.parseFloat(scan.nextLine());

            System.out.print("indirim orani'ni giriniz: ");
            float pricesalePer = Float.parseFloat(scan.nextLine());

            System.out.print("Stok durumunu Giriniz: ");
            int stoks = Integer.parseInt(scan.nextLine());


            System.out.print("urunun markasini giriniz" + "(\n0- " + Markalar.Samsung + "\n1- " + Markalar.Lenovo + "\n2- " + Markalar.Apple + "\n3- " + Markalar.Huawei +
                    "\n4- " + Markalar.Casper + "\n5- " + Markalar.Asus + "\n6- " + Markalar.HP + "\n7- " + Markalar.Xiaomi + "\n8- " + Markalar.Monster+"\n: ");
            int brand = Integer.parseInt(scan.nextLine());

            System.out.print("urunun hafizasini giriniz: ");
            int memory = Integer.parseInt(scan.nextLine());

            System.out.print("urunun ekran boyutunu giriniz: ");
            float screenSize = Float.parseFloat(scan.nextLine());

            System.out.print("urunun Ramini giriniz: ");
            int ram = Integer.parseInt(scan.nextLine());

            System.out.print("Urunun batarya Degerini giriniz: ");
            int batery = Integer.parseInt(scan.nextLine());
            id = brand;
            phone o = new phone(id, urunno, price, pricesalePer, stoks, name2, brand, memory, screenSize, ram, color, batery); //yeni nesne olusturuyorum
            phoneList.add(o); //listeme ekliyorum
        }catch (Exception e){
            System.out.println(uyari);
        }
    }
    public void addComputer(){ // bilgisayar ekleme
        int id;
        int urunno=idler;
        idler++;

        try {
            System.out.print("urun fiyatini giriniz: ");
            float price = Float.parseFloat(scan.nextLine());

            System.out.print("indirim orani'ni giriniz: ");
            float pricesalePer = Float.parseFloat(scan.nextLine());

            System.out.print("Stok durumunu Giriniz: ");
            int stoks = Integer.parseInt(scan.nextLine());

            System.out.print("urunun adini giriniz: ");
            String name1 = scan.nextLine();

            System.out.print("urunun markasini giriniz" + "(\n0- " + Markalar.Samsung + "\n1- " + Markalar.Lenovo + "\n2- " + Markalar.Apple + "\n3- " + Markalar.Huawei +
                    "\n4- " + Markalar.Casper + "\n5- " + Markalar.Asus + "\n6- " + Markalar.HP + "\n7- " + Markalar.Xiaomi + "\n8- " + Markalar.Monster+"\n: ");
            int brand = Integer.parseInt(scan.nextLine());

            System.out.print("urunun hafizasini giriniz: ");
            int memory = Integer.parseInt(scan.nextLine());

            System.out.print("urunun ekran boyutunu giriniz: ");
            float screenSize = Float.parseFloat(scan.nextLine());

            System.out.print("urunun Ramini giriniz: ");
            int ram = Integer.parseInt(scan.nextLine());
            id = brand;//markanin idsi
            computer o = new computer(id, urunno, price, pricesalePer, stoks, name1, brand, memory, screenSize, ram);//nesne olusturuyorum
            computerList.add(o);//listeme olusturdugum nesneyi atiyorum
        }catch (Exception e){
            System.out.println(uyari);
        }
    }
    public void sil(){
        int a;
        yazdirPc();
        yazdirPhone();
        System.out.println("Silmek istediginiz urun benzersuzno yu giriniz");
        a=scan.nextInt();
        try{
            silComputer(a);
        }catch (Exception e){
            System.out.println("\n");
        }
        try{
            silPhone(a);
        }catch (Exception e){
            System.out.println("\n");
        }
    }
    public void silPhone(int a){

        for(int i=0;i<=phoneList.size();i++){
            if(phoneList.get(i).urunno==a){
                phoneList.remove(i);
                break;
            }
        }
    }
    public void silComputer(int a){

        for(int i=0;i<=computerList.size();i++){
            if(computerList.get(i).urunno==a){
                computerList.remove(i);
                break;
            }
        }
    }
    public void yazdirPc(){
        for(int i=0;i<computerList.size();i++){
            System.out.format("urun benzersiz no: %d,\nfiyat:%.2f,\nindirim orani:%.2f,\nstok durumu: %d,\nurun adi: %s,\nurun markasi: %s,\n" +
                    "urun hafiza:%dSSD,\nekran buyuklugu:%.2f,\nram:%dGB\n\n",computerList.get(i).urunno,computerList.get(i).price,
                    computerList.get(i).salePer,computerList.get(i).stok,computerList.get(i).name,
                    Markalar.values()[computerList.get(i).brand],
                    computerList.get(i).memory,
                    computerList.get(i).ScreenSize,
                    computerList.get(i).ram);
        }
    }
    public void yazdirPhone(){
        for(int i=0;i<phoneList.size();i++){
            System.out.format("urun benzersiz no: %d,\nfiyat:%.2f,\nindirim orani:%.2f,\nstok durumu: %d,\nurun adi: %s,\nurun markasi: %s,\n" +
                            "urun hafiza:%dGB,\nekran buyuklugu:%.2f,\nram:%dGB,\nrenk: %s,\nbatarya: %dmah\n\n",phoneList.get(i).urunno,phoneList.get(i).price,
                    phoneList.get(i).salePer,phoneList.get(i).stok,phoneList.get(i).name,
                    Markalar.values()[phoneList.get(i).brand],
                    phoneList.get(i).memory,
                    phoneList.get(i).ScreenSize,
                    phoneList.get(i).ram,
                    phoneList.get(i).renk,
                    phoneList.get(i).battery);
        }
    }
    public void filterByBrand(){
        int n;
        System.out.print("Filtrelemek istediginiz Markayi Seciniz" + "(\n0- " + Markalar.Samsung + "\n1- " + Markalar.Lenovo + "\n2- " + Markalar.Apple + "\n3- " + Markalar.Huawei +
                "\n4- " + Markalar.Casper + "\n5- " + Markalar.Asus + "\n6- " + Markalar.HP + "\n7- " + Markalar.Xiaomi + "\n8- " + Markalar.Monster+"\n: ");
        n = scan.nextInt();
        System.out.println(Markalar.values()[n]+" Markasina ait Urunler getiriliyor");
        System.out.println("====Telefonlar===");
        for(int i=0;i<phoneList.size();i++){
            if(phoneList.get(i).brand==n) {
                System.out.format("urun benzersiz no: %d,\nfiyat:%.2f,\nindirim orani:%.2f,\nstok durumu: %d,\nurun adi: %s,\nurun markasi: %s,\n" +
                                "urun hafiza:%dGB,\nekran buyuklugu:%.2f,\nram:%dGB,\nrenk: %s,\nbatarya: %dmah\n\n", phoneList.get(i).urunno, phoneList.get(i).price,
                        phoneList.get(i).salePer, phoneList.get(i).stok, phoneList.get(i).name,
                        Markalar.values()[phoneList.get(i).brand],
                        phoneList.get(i).memory,
                        phoneList.get(i).ScreenSize,
                        phoneList.get(i).ram,
                        phoneList.get(i).renk,
                        phoneList.get(i).battery);
            }
        }
        System.out.println("====Bilgisayarlar===");
        for(int i=0;i<computerList.size();i++){
            if(computerList.get(i).brand==n) {
            System.out.format("urun benzersiz no: %d,\nfiyat:%.2f,\nindirim orani:%.2f,\nstok durumu: %d,\nurun adi: %s,\nurun markasi: %s,\n" +
                            "urun hafiza:%dSSD,\nekran buyuklugu:%f,\nram:%dGB\n\n",computerList.get(i).urunno,computerList.get(i).price,
                    computerList.get(i).salePer,computerList.get(i).stok,computerList.get(i).name,
                    Markalar.values()[computerList.get(i).brand],
                    computerList.get(i).memory,
                    computerList.get(i).ScreenSize,
                    computerList.get(i).ram);
        }
    }
    }
    public void filterByNo(){
        int n;
        System.out.print("Goruntulemek istediginiz urun noyu giriniz: ");
        n= scan.nextInt();
        for(int i=0;i<phoneList.size();i++){
            if(phoneList.get(i).urunno==n) {

                System.out.format("urun benzersiz no: %d,\nfiyat:%.2f,\nindirim orani:%.2f,\nstok durumu: %d,\nurun adi: %s,\nurun markasi: %s,\n" +
                                "urun hafiza:%dGB,\nekran buyuklugu:%.2f,\nram:%dGB,\nrenk: %s,\nbatarya: %dmah\n\n", phoneList.get(i).urunno, phoneList.get(i).price,
                        phoneList.get(i).salePer, phoneList.get(i).stok, phoneList.get(i).name,
                        Markalar.values()[phoneList.get(i).brand],
                        phoneList.get(i).memory,
                        phoneList.get(i).ScreenSize,
                        phoneList.get(i).ram,
                        phoneList.get(i).renk,
                        phoneList.get(i).battery);
                break;
            }
        }
        for(int i=0;i<computerList.size();i++){
            if(computerList.get(i).urunno==n) {
                System.out.format("urun benzersiz no: %d,\nfiyat:%.2f,\nindirim orani:%.2f,\nstok durumu: %d,\nurun adi: %s,\nurun markasi: %s,\n" +
                                "urun hafiza:%dSSD,\nekran buyuklugu:%.2f,\nram:%dGB\n\n",computerList.get(i).urunno,computerList.get(i).price,
                        computerList.get(i).salePer,computerList.get(i).stok,computerList.get(i).name,
                        Markalar.values()[computerList.get(i).brand],
                        computerList.get(i).memory,
                        computerList.get(i).ScreenSize,
                        computerList.get(i).ram);
                break;
            }
        }
    }
}
