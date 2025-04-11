package utpdua;

public class SistemLelang {
    public static void main(String[] args) {
        Peserta andi = new Peserta("Andi", 9_000_000);
        Peserta budi = new Peserta("Budi", 25_000_000);
        Peserta iwan = new Peserta("Iwan", 30_000_000);
        Peserta dina = new Peserta("Dina", 10_000_000);
        Peserta eka = new Peserta("Eka", 5_000_000);

        Elektronik kamera = new Elektronik("Kamera DSLR Canon", 4_000_000, 2);
        Seni lukisan = new Seni("Lukisan Abstrak Modern", 8_000_000, "Seniman Lokal");
        Elektronik tv = new Elektronik("Smart TV 55 Inch", 7_000_000, 2);
        Seni patung = new Seni("Patung Liberty Mini", 3_000_000, "Unknown Artist");

        kamera.mulaiLelang();
        kamera.infoElektronik();
        budi.tawar(kamera, 4_500_000);
        dina.tawar(kamera, 5_000_000);
        andi.tawar(kamera, 5_500_000);
        budi.tawar(kamera, 6_000_000);
        kamera.tutupLelang();
        iwan.tawar(kamera, 6_500_000);

        lukisan.mulaiLelang();
        lukisan.infoSeni();
        eka.tawar(lukisan, 7_000_000);
        budi.tawar(lukisan, 9_000_000);
        iwan.tawar(lukisan, 10_000_000);
        lukisan.tutupLelang();

        tv.mulaiLelang();
        tv.infoElektronik();
        iwan.tawar(tv, 7_500_000);
        budi.tawar(tv, 8_000_000);
        dina.tawar(tv, 8_500_000);
        iwan.tawar(tv, 8_000_000);
        eka.tawar(tv, 9_000_000);
        iwan.tawar(tv, 9_500_000);
        tv.tutupLelang();

        patung.mulaiLelang();
        patung.infoSeni();
        eka.tawar(patung, 4_000_000);
        dina.tawar(patung, 4_500_000);
        budi.tawar(patung, 5_000_000);
        eka.tawar(patung, 4_500_000);
        patung.tutupLelang();
        andi.tawar(patung, 5_500_000);
    }
}


