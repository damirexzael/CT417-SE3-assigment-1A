package org.sonatype.mavenbook;

// import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

// import org.sonatype.mavenbook.*;

/**
 * Unit test for simple App.
 */
public class StudentTest 
{
    /**
     * Constructor age allowed
     */
    @Test(expected = IllegalArgumentException.class)
    public void ilegalAge()
    {
        Integer ID = 3;
        String name = "Pablito";
        Integer age = -3;
        new Student(ID, name, age);
    }

    /**
     * Constructor equal values
     */
    @Test
    public void initObject()
    {
        Integer ID = 20;
        String name = "Pablito";
        Integer age = 3;
        Student t1 = new Student(ID, name, age);
        // Check name
        assertEquals("Student name must be "+name+".", name, t1.getName());
        // Check age
        assertEquals("Student age must be "+age.toString()+".", age, t1.getAge());
        // Check username
        assertEquals(
            "Student username must be "+name+age.toString()+".", name+age.toString(), t1.getUsername()
            );
    }


}
