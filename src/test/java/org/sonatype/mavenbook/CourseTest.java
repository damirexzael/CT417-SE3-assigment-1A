package org.sonatype.mavenbook;
import static org.junit.Assert.*;

import java.util.Date;

import org.joda.time.DateTime;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CourseTest 
{
    @Test
    public void constructor()
    {
        Date today = new Date();
        String name = "IT";
        DateTime startDate = new DateTime(today);
        DateTime endDate = new DateTime(today);
        Course c1 = new Course(name, startDate, endDate);
        
        // Check name
        assertEquals("Student name must be "+name+".", name, c1.getName());
    }
}