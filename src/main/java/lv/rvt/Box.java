package lv.rvt;

import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= capacity) {
            items.add(item);
        }
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }


    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + String.format("%.1f", weight()) + " kg";
    }

    public static void main(String[] args) {
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        Box box = new Box(10);

        box.add(book1);
        box.add(book2);
        box.add(book3);

        box.add(cd1);
        box.add(cd2);
        box.add(cd3);

        System.out.println(box);



        Box smallerBox = new Box(5);
        smallerBox.add(book1);
        smallerBox.add(cd1);


        Box biggerBox = new Box(10);
        biggerBox.add(smallerBox);
        biggerBox.add(book2);

        System.out.println(biggerBox);


    }
}