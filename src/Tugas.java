interface Operasi {
    int hitung(int a, int b);
}

class Penjumlahan implements Operasi {
    @Override
    public int hitung(int a, int b) {
        return a + b;
    }
}

class Pengurangan implements Operasi {
    @Override
    public int hitung(int a, int b) {
        return a - b;
    }
}

class Perkalian implements Operasi {
    @Override
    public int hitung(int a, int b) {
        return a * b;
    }
}

class Pembagian implements Operasi {
    @Override
    public int hitung(int a, int b) {
        return a / b;
    }
}

class Kalkulator {
    private Operasi operasi;

    public Kalkulator(Operasi operasi) {
        this.operasi = operasi;
    }

    public void setOperasi(Operasi operasi) {
        this.operasi = operasi;
    }

    public int hitung(int a, int b) {
        return operasi.hitung(a, b);
    }
}