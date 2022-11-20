
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User { //ui ekranim
    Scanner scan = new Scanner(System.in);
    Islemler x = new Islemler();
    public void baslat(){
        System.out.println("\n========PATIKA STORE=======");
        int n=100,m;
        while(n!=5) {
            System.out.println("\n\nUrun Listelemek icin:\t1,\n"+
                    "Urun eklemek icin:\t2,\n"+
                    "Urun Silmek icin:\t3,\n"+
                    "Urun Filtrelemek icin:\t4,\n"+
                    "Sistemi Kapatmak icin:\t5,");


            n=scan.nextInt();
            switch (n) {
                case 1:
                    System.out.println("\nLutfen bir kategori seciniz: \ncep telefonu icin: 1\nbilgisayar icin: 2\nbaska bir islem icin: 3");
                    m=scan.nextInt();
                    switch (m){
                        case 1:
                            x.yazdirPhone();
                            break;
                        case 2:
                            x.yazdirPc();
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\nLutfen bir kategori seciniz: \ncep telefonu icin: 1\nbilgisayar icin: 2\nbaska bir islem icin: 3");
                    m=scan.nextInt();
                    switch (m){
                        case 1:
                            x.addPhone();
                            break;
                        case 2:
                            x.addComputer();
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 3:
                    x.sil();
                    break;
                case 4:
                    System.out.println("\nMarkaya gore filtrelemek icin: 1\nurun no ya gore filtrelemek icin: 2");
                    m= scan.nextInt();
                    switch (m){
                        case 1:
                            x.filterByBrand();
                            break;
                        case 2:
                            x.filterByNo();
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("\nSistem Kapatiliyor...");
                    break;
            }
        }
    }
}
