/*
public interface CourseFactory
{
    public void addCodingLab();
    public void addCodingProject();
}
*/


/* public class CourseFactory
    /* if "Semester"
        - make semester course
    if "Self-pace"
        - Make self-pace course



*/




public class CourseFactory
{
    protected CourseFactory CourseFactory(String courseType, String n, Double f, String u, String s, String uploadDate, String expiration)
    {
        /*
        if (courseType.equals("Self-Pace"))
        {
            // create the right course
            SelfPaceCourse spc = new SelfPaceCourse(n, f, u, s, uploadDate, expiration);
        }
        else
        {
            SemesterCourse sc = new SemesterCourse(n, f, u, s, semester, duration, credits, certification, instructor);
        }
        */
        SelfPaceCourse spc = new SelfPaceCourse(n, f, u, s, uploadDate, expiration);
    }

    protected CourseFactory CourseFactory(String courseType, String n, Double f, String u, String s, String semester, Double duration, Double credits, String certification, String instructor)
    {
        /*
        if (courseType.equals("Self-Pace"))
        {
            // create the right course
            SelfPaceCourse spc = new SelfPaceCourse(n, f, u, s, uploadDate, expiration);
        }
        else
        {
            SemesterCourse sc = new SemesterCourse(n, f, u, s, semester, duration, credits, certification, instructor);
        }
        */
        SemesterCourse sc = new SemesterCourse(n, f, u, s, semester, duration, credits, certification, instructor);
    }
}
