//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("penguin");
        TidakTerbang penguin = new TidakTerbang();
        penguin.warna ="hitam,putih";
        penguin.Berjalan();
        penguin.Terbang();
        penguin.Suara();
        System.out.println(penguin.warna);

        System.out.println();

        Unggas merpati = new Unggas();
        System.out.println("objek merpati");
        merpati.Berjalan();
        merpati.warna=" oren ";
        merpati.Suara();
        System.out.println("berwarna" + merpati.warna);
        merpati.Terbang();

        Mhs mahasiswa = new Mhs();
        System.out.println("data mahasiswa");
        mahasiswa.nama="Teuku Aldie ";
        mahasiswa.Nim="2022573010079";
        mahasiswa.email="teukualdiaulia@gmail.com";
        mahasiswa.JenisKelamin="Pria";
        mahasiswa.Alamat="Banda Masen";

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.Nim);
        System.out.println(mahasiswa.email);
        System.out.println(mahasiswa.JenisKelamin);
        System.out.println(mahasiswa.Alamat);

        System.out.println();

        Dosen dosen = new Dosen();
        System.out.println("data dosen");
        dosen.nama="Muhammad Reza";
        dosen.Nip="2022573010079";
        dosen.email="Reza@pnl.ac.id";
        dosen.JenisKelamin="Pria";
        dosen.Alamat="Aceh";

        System.out.println(dosen.nama);
        System.out.println(dosen.Nip);
        System.out.println(dosen.email);
        System.out.println(dosen.JenisKelamin);
        System.out.println(dosen.Alamat);

        System.out.println();

        sepeda sepedaBmx = new sepeda();
        sepedaBmx.berjalan();
        sepedaBmx.berhenti();

        sepedaMotor motor1 = new sepedaMotor();
        motor1.berjalan();
        motor1.berhenti();
        motor1.klaksoen();

        // Abstract
        System.out.println("contoh kelas abstrak");
        System.out.println();
        Employee empBaru = new NewEmployee();
        empBaru.printInfo();
        empBaru.companyInfo();

        Employee empLama = new OldEmployee();
        empLama.printInfo();
        empLama.companyInfo();

        System.out.println("contoh pemilihan dari interface dan abstrak");
        System.out.println();
        System.out.println("-Abstract-");
        ShapeAbstract bulat = new Circle(2);
        Rectangle pp = new Rectangle(2,5);
        bulat.calculateArea();
        pp.calculateArea();
        bulat.draw();
        pp.draw();
        System.out.println();

        System.out.println("-Interface-");
        Bulat bulat2 = new Bulat(2);
        PersegiPanjang pp2 = new PersegiPanjang(2,5);
        bulat2.calculateArea();
        pp.calculateArea();
        bulat2.draw();
        pp2.draw();
        System.out.println();
    }
}
