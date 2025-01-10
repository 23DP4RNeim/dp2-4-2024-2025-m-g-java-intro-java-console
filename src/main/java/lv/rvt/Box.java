package lv.rvt;
public class Box {
    private  double width;
    private  double height;
    private  double length;

    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("Area: " + box.area() + " volume: " + box.volume());

        Box biggerBox = box.biggerBox(box);
        System.out.println("Bigger Box Area: " + biggerBox.area() + " volume: " + biggerBox.volume());

        Box smallerBox = box.smallerBox(box);
        System.out.println("Smaller Box Area: " + smallerBox.area() + " volume: " + smallerBox.volume());

        Box nestedBox = new Box(2.0, 4.0, 5.0);
        System.out.println("Can nestedBox fit inside box? " + nestedBox.nests(box));
    }



    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }


    public double length() {
        return length;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }

    public Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.width(), 1.25 * oldBox.height(), 1.25 * oldBox.length());
    }

    public Box smallerBox(Box oldBox) {
        return new Box(0.75 * oldBox.width(), 0.75 * oldBox.height(), 0.75 * oldBox.length());
    }

    public boolean nests(Box outsideBox) {
        return this.width < outsideBox.width &&
               this.height < outsideBox.height &&
               this.length < outsideBox.length;
    }
}

