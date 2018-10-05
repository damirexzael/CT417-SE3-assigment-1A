package org.sonatype.mavenbook;

/**
 * Hello world!
 *
 */
public class Student 
{
    private String name;
    private Integer age;
    private Integer ID;

    public Student(Integer _ID, String _name, Integer _age) 
    {
        if (_age < 0) 
            throw new IllegalArgumentException("Age cannot be negative.");
        this.name = _name;
        this.age = _age;
        this.ID = _ID;
    }

    public Integer getID() 
    {
        return this.ID;
    }

    public String getName() 
    {
        return this.name;
    }

    public Integer getAge() 
    {
        return this.age;
    }

    public void setName(String _name) 
    {
        this.name = _name;
    }

    public void setAge(Integer _age)
    {
        this.age = _age;
    }

    public String getUsername()
    {
        return this.name+this.age.toString();
    }
}