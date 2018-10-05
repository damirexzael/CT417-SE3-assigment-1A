package org.sonatype.mavenbook;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

/**
 * Course
 *
 */
public class Course 
{
    private String name;
    private DateTime startDate;
    private DateTime endDate;
    public List<Module> moduleList;

    public Course(String name, DateTime startDate, DateTime endDate)
    {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.moduleList = new ArrayList<Module>();
    }

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public DateTime getStartdate()
	{
		return this.startDate;
	}

	public void setStartdate(DateTime startDate)
	{
		this.startDate = startDate;
	}

	public DateTime getEnddate()
	{
		return this.endDate;
	}

	public void setEnddate(DateTime endDate)
	{
		this.endDate = endDate;
	}


}