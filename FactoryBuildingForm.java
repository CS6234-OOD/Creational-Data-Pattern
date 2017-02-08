public class FactoryBuildingForm
{
    protected Course createCourse(String courseType, String n, Double f, String u, String s, String uploadDate, String expiration)
    {
        //Course newCourse = null;

        Course newCourse = null;
        //CourseFactory courseFactory = new CourseFactory(courseType, n, f, u, s, uploadDate, expiration);
        CourseFactory courseFactory = new CourseFactory();
        newCourse = courseFactory.createCourse(courseType, n, f, u, s, uploadDate, expiration);
        return newCourse;
    }

    protected Course createCourse(String courseType, String n, Double f, String u, String s, String semester, Double duration, Double credits, String certification, String instructor)
    {
        //Course newCourse = null;

        Course newCourse = null;
        //CourseFactory courseFactory = new CourseFactory(courseType, n, f, u, s, semester, duration, credits, certification, instructor);

        CourseFactory courseFactory = new CourseFactory();
        newCourse = courseFactory.createCourse(courseType, n, f, u, s, semester, duration, credits, certification, instructor);
        return newCourse;
    }
}
