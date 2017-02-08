public class MakeCourseTesting
{
    public static void main(String [] args)
    {
        CourseBuildingForm MakeCourses = new CourseBuildingForm();

        Course CS = MakeCourses.orderTheCourse("CS");
        System.out.println(CS + "\n");

        Course Math = MakeCourses.orderTheCourse("Math");
        System.out.println(Math + "\n");
    }
}
