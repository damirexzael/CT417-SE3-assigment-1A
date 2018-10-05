package org.sonatype.mavenbook;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ModuleTest 
{
    @Test
    public void constructor()
    {
        String name = "SOftware Engineering";
        String ID = "TI324";
        Module m1 = new Module(name, ID);
        
        // Check name
        assertEquals("Student name must be "+name+".", name, m1.getName());
        // Check ID
        assertEquals("Student age must be "+ID+".", ID, m1.getId());
    }

    @Test
    public void studentList()
    {
        String name = "SOftware Engineering";
        String ID = "TI324";
        Module m1 = new Module(name, ID);

        // Init student list size
        assertEquals("Student List size must be 0.", 0, m1.studemtList.size());
        
        // Add 1 student
        Integer student_ID = 20;
        String student_name = "Pablito";
        Integer student_age = 3;
        Student t1 = new Student(student_ID, student_name, student_age);
        m1.studemtList.add(t1);
        assertEquals("Student List size must be 1.", 1, m1.studemtList.size());
        
        // Add 2 students
        student_ID = 23;
        student_name = "Pablito2";
        student_age = 33;
        Student t2 = new Student(student_ID, student_name, student_age);
        m1.studemtList.add(t2);
        student_ID = 24;
        student_name = "Pablito3";
        student_age = 15;
        Student t3 = new Student(student_ID, student_name, student_age);
        m1.studemtList.add(t3);
        assertEquals("Student List size must be 3.", 3, m1.studemtList.size());
        
        // Remove 1 student
        m1.studemtList.remove(t1);
        assertEquals("Student List size must be 2.", 2, m1.studemtList.size());

        // Remove 2 students
        m1.studemtList.remove(t2);
        m1.studemtList.remove(t3);
        assertEquals("Student List size must be 0.", 0, m1.studemtList.size());

    }

}