public abstract class Course
{
    private String name;

    /*
    public Course(String name)
    {
        this.name = name;
    }
    */
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    abstract void makeCourse();

    public String toString()
    {
        return "A new course has been created: " + name;
    }
}
