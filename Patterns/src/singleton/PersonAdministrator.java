package singleton;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {
    Set<Person> personSet = new HashSet<>();
    private static PersonAdministrator instance;

    public static PersonAdministrator getInstance() {
        if (instance == null) {
            instance = new PersonAdministrator();
        }
        return instance;
    }

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void addPerson(Person p) {
        personSet.add(p);
    }

    public void removePerson(Person p) {
        personSet.remove(p);
    }
}
