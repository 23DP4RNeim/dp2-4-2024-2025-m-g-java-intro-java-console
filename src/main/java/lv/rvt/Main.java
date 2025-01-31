package lv.rvt;

import java.util.ArrayList;

public class Main {
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        System.out.println(ada);
        System.out.println(esko);

        int i = 0;
        while (i < 25) {
            ollie.study();
            i++;
        }


        System.out.println(ollie);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }
}

