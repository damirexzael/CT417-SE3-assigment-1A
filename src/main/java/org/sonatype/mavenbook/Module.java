package org.sonatype.mavenbook;

import java.util.ArrayList;
import java.util.List;

/**
 * Module
 *
 */
public class Module 
{
    private String name;
    private String ID;
    public List<Student> studemtList;

    public Module(String name, String ID)
    {
        this.name = name;
        this.ID = ID;
        this.studemtList = new ArrayList<Student>();
    }

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getId()
	{
		return this.ID;
	}

	public void setId(String ID)
	{
		this.ID = ID;
	}
}
