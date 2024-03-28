public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator(new Penjumlahan());
        int hasil = kalkulator.hitung(10, 5);
        System.out.println("Hasil penjumlahan: " + hasil);

        kalkulator.setOperasi(new Pengurangan());
        hasil = kalkulator.hitung(10, 5);
        System.out.println("Hasil pengurangan: " + hasil);

        kalkulator.setOperasi(new Perkalian());
        hasil = kalkulator.hitung(10, 5);
        System.out.println("Hasil perkalian: " + hasil);

        kalkulator.setOperasi(new Pembagian());
        hasil = kalkulator.hitung(10, 5);
        System.out.println("Hasil pembagian: " + hasil);

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelduck = new ModelDuck();
        modelduck.performFly();
        modelduck.setFlyBehavior(new FlyWithRocketPower());
        modelduck.performFly();
    }
}
