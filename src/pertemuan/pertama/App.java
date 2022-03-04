package pertemuan.pertama;
class Mobil {
    public String merek;
    public String plat;
    public int harga;

    void print(){
        System.out.println(merek);
        System.out.println(plat);
        System.out.println(harga);
    }

    public int perkalian(int angka){
        return angka * 2;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mobil mobil1 = new Mobil();
        mobil1.merek = "toyota";
        mobil1.plat = "B 1234 M";
        mobil1.harga = 5000;
        mobil1.print();

        Mobil mobil2 = new Mobil();
        mobil2.merek = "mitsubishi";
        mobil2.plat = "A 1234 J";
        mobil2.harga = 7000;
        mobil2.print();
        
    }
}
