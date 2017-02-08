public class MakeCourseTesting
{
    public static void main(String [] args)
    {
        CourseBuildingForm MakeCourse = new CourseBuildingForm();

        Course CS = MakeCourse.createCourse("Self-Pace");
        //System.out.println(CS + "\n");

        //Course CS = MakeCourse.orderTheCourse("CS");
        //System.out.println(CS + "\n");
    }
}
