package iterator.personcollection;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        Person p1 = new Person("Hans");
        Person p2 =new Person("Børge");
        Person p3 = new Person("Finn");
        Person p4 = new Person("Peter");

        PersonCollection personCollection = new PersonCollection();

        personCollection.add(p1);
        personCollection.add(p2);
        personCollection.add(p3);
        personCollection.add(p4);

        for (Person p : personCollection){
            System.out.println(p);
        }

        System.out.println(personCollection);
        System.out.println(personCollection.iterator().next());
        System.out.println(personCollection.iterator().hasNext());
    }
}
