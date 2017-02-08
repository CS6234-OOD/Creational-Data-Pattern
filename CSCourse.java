public class CSCourse extends Course
{
    CourseFactory courseFactory;

    public CSCourse(CourseFactory courseFactory)
    {
        this.courseFactory = courseFactory;
    }

    public void makeCourse()
    {
        System.out.println("Making CS course");
    }
}
