public class CourseFactory
{
    protected Course createCourse(String courseType, String n, Double f, String u, String s, String uploadDate, String expiration)
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
        return spc;
    }

    protected Course createCourse(String courseType, String n, Double f, String u, String s, String semester, Double duration, Double credits, String certification, String instructor)
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
        return sc;
    }
}
