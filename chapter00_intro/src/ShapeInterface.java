interface ShapeInterface {
    double calculateArea();

    void draw();

}

class PersegiPanjang implements ShapeInterface{
    private double length;
    private double width;

    public PersegiPanjang(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
    public void displayInfo() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
    }
}

class Bulat implements ShapeInterface {
    private double radius;

    public Bulat(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing a circle.");
    }
    
    public void displayInfo() {
        System.out.println("Circle - Radius: " + radius);
    }
}