class Unggas {
    public String warna;

    public void Suara(){
       System.out.println("cukuruku");
    }

    public void Berjalan(){
        System.out.println("jalan");
    }

    public void Terbang(){
        System.out.println("terbang dengan sayap");
    }
}
    class BisaTerbang extends Unggas {
        public void Terbang() {
            System.out.println("terbang menggunakan sayap");
        }
    }
      class TidakTerbang extends Unggas {
          public void Terbang(){
              System.out.println("loncad");
          }
  }

