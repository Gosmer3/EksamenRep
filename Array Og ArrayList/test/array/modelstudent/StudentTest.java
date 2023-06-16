package array.modelstudent;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    String navn;
    int alder;

    @BeforeEach
    void setup() {
        alder = 20;
        navn = "Lasse";
        student = new Student(navn, alder);
    }

    @Test
    void getAge() {
        assertEquals(20, student.getAge());
    }

    @Test
    void getName() {
        assertEquals("Lasse",student.getName());
    }

    @Test
    void isActive() {
        student.setActive(true);
        assertTrue(student.isActive());
    }
}