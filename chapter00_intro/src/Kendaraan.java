public interface Kendaraan {
    void berjalan();
    void berhenti();

}

class sepeda implements Kendaraan{

    @Override
    public void berjalan() {
        System.out.println("didayung");
    }

    @Override
    public void berhenti() {
        System.out.println("di rem");
    }
}

class sepedaMotor implements Kendaraan{

    @Override
    public void berjalan() {
        System.out.println("di gas");
    }

    @Override
    public void berhenti() {
        System.out.println("di rem");
    }
    public void klaksoen(){
        System.out.println("pret pret");
    }

}