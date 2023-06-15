package singleton;

public class App {
    public static void main(String[] args) {
        PersonAdministrator personer = PersonAdministrator.getInstance();

        personer.addPerson(new Person("Hans","Hansen",24));
        personer.addPerson(new Person("Jens","Mortens",24));
        personer.addPerson(new Person("Ib","Kajsen",24));
        personer.addPerson(new Person("Bo","Peterson",24));
        personer.addPerson(new Person("Ann","Hansen",24));

        System.out.println(personer.getPersonSet());
    }
}
