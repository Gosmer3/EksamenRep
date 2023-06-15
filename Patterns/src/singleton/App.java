package singleton;

public class App {
    public static void main(String[] args) {
        PersonAdministrator personer = PersonAdministrator.getInstance();

        Person p1 = new Person("Hans", "Hansen", 24);
        Person p2 = new Person("Jens", "Mortens", 53);
        Person p3 = new Person("Ib", "Kajsen", 93);
        Person p4 = new Person("Bo", "Peterson", 13);
        Person p5 = new Person("Ann", "Hansen", 56);

        personer.addPerson(p1);
        personer.addPerson(p2);
        personer.addPerson(p3);
        personer.addPerson(p4);
        personer.addPerson(p5);

        System.out.println(personer.getPersonSet());

        personer.removePerson(p3);

        System.out.println(personer.getPersonSet());
    }
}
