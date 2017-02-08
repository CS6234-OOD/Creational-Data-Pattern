public class CourseBuildingForm extends CourseBuildingHandle
{
    protected Course makeCourse(String courseType)
    {
        Course newCourse = null;


        if (courseType.equals("CS"))
        {
            System.out.println("Course Type: CS");
            CSCourseFactory csCourseFactory = new CSCourseFactory();

            // polymorphism
            newCourse = new CSCourse(csCourseFactory);
            newCourse.setName("Object-Oriented-Design");
        }
        return newCourse;
    }
}
